package com.elksa.demo.reusableadapter.ui.utils

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class ItemViewHolder<B : ViewDataBinding, I : ItemBw>(
    protected var binding: B? = null
) : RecyclerView.ViewHolder(binding?.root!!) {

    fun bind(item: I, itemClickListener: ((I) -> Unit)?) {
        initBinding(item)
        itemView.setOnClickListener {
            itemClickListener?.invoke(item)
        }
        binding?.executePendingBindings()
    }

    abstract fun initBinding(item: ItemBw)
}