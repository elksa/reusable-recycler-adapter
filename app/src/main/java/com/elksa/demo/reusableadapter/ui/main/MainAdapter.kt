package com.elksa.demo.reusableadapter.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.elksa.demo.reusableadapter.databinding.ItemMainBodyBinding
import com.elksa.demo.reusableadapter.databinding.ItemMainHeaderBinding
import com.elksa.demo.reusableadapter.ui.utils.ItemBw
import com.elksa.demo.reusableadapter.ui.utils.ItemBw.ItemType.HEADER
import com.elksa.demo.reusableadapter.ui.utils.ItemListAdapter
import com.elksa.demo.reusableadapter.ui.utils.ItemViewHolder

class MainAdapter : ItemListAdapter<ItemBw>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder<*, ItemBw> {
        return if (viewType == HEADER.ordinal) {
            ItemMainHeaderViewHolder(parent)
        } else {
            ItemSummaryBodyViewHolder(parent)
        }
    }

    class ItemMainHeaderViewHolder(parent: ViewGroup) :
        ItemViewHolder<ItemMainHeaderBinding, ItemBw>(getBinding(parent)) {

        companion object {
            fun getBinding(parent: ViewGroup): ItemMainHeaderBinding =
                ItemMainHeaderBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
        }

        override fun initBinding(item: ItemBw) {
            binding?.item = item as ItemMainHeader
        }
    }

    class ItemSummaryBodyViewHolder(parent: ViewGroup) :
        ItemViewHolder<ItemMainBodyBinding, ItemBw>(getBinding(parent)) {

        companion object {
            fun getBinding(parent: ViewGroup): ItemMainBodyBinding =
                ItemMainBodyBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
        }

        override fun initBinding(item: ItemBw) {
            binding?.item = item as ItemMainBody
        }
    }
}