package com.elksa.demo.reusableadapter.ui.main

import com.elksa.demo.reusableadapter.ui.utils.ItemBw
import com.elksa.demo.reusableadapter.ui.utils.ItemBw.ItemType
import com.elksa.demo.reusableadapter.ui.utils.ItemBw.ItemType.HEADER

class ItemMainHeader(val title: String) : ItemBw {

    override val id: String
        get() = title

    override val type: ItemType
        get() = HEADER

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ItemMainHeader) return false

        if (title != other.title) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}