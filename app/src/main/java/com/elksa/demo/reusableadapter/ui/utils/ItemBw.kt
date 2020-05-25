package com.elksa.demo.reusableadapter.ui.utils

interface ItemBw {

    enum class ItemType { HEADER, BODY }

    val id: String
    val type: ItemType
}