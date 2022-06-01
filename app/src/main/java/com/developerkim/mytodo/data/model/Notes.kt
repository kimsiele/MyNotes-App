package com.developerkim.mytodo.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    var noteCategory: String = "",
    var noteTitle: String = "",
    var noteText: String = "",
    var noteDate: String = "",
    var isFavorite:Boolean = false,
    var priority:String = "none"
):Parcelable


