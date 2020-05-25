package com.elksa.demo.reusableadapter.ui.main

import com.elksa.demo.reusableadapter.ui.utils.ItemBw
import com.elksa.demo.reusableadapter.ui.utils.ItemBw.ItemType
import com.elksa.demo.reusableadapter.ui.utils.ItemBw.ItemType.BODY

class ItemMainBody(
    val idWave: String,
    val description: String,
    val unit: String,
    val value: String
) : ItemBw {

    override val id: String
        get() = idWave

    override val type: ItemType
        get() = BODY

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ItemMainBody) return false

        if (idWave != other.idWave) return false
        if (description != other.description) return false
        if (unit != other.unit) return false
        if (value != other.value) return false
        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        var result = idWave.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + unit.hashCode()
        result = 31 * result + value.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }


}