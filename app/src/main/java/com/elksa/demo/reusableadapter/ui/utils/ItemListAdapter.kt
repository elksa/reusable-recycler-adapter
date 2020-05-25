package com.elksa.demo.reusableadapter.ui.utils

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class ItemListAdapter<I : ItemBw>(
    private var itemClickListener: ((I) -> Unit)? = null
) : ListAdapter<ItemBw, ItemViewHolder<*, I>>(ItemDiffCallback()) {

    fun setOnItemClickListener(itemClickListener: ((I) -> Unit)) {
        this.itemClickListener = itemClickListener
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: ItemViewHolder<*, I>, position: Int) {
        holder.bind(getItem(position) as I, itemClickListener)
    }

    override fun getItemViewType(position: Int) = getItem(position).type.ordinal

    class ItemDiffCallback : DiffUtil.ItemCallback<ItemBw>() {

        override fun areItemsTheSame(oldItem: ItemBw, newItem: ItemBw) = oldItem.id == newItem.id

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: ItemBw, newItem: ItemBw) = oldItem == newItem
    }
}