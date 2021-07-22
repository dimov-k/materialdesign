package ru.mrroot.materialdesign.ui.recycler_activity

import ru.mrroot.materialdesign.ui.recycler_activity.model.Data

interface OnListItemClickListener {
    fun onItemClick(data: Data)
}