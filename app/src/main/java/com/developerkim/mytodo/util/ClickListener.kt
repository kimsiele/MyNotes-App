package com.developerkim.mytodo.util

import android.view.View
import android.widget.ImageButton
import com.developerkim.mytodo.data.model.Note

interface ClickListener {
    fun onClick(view: View,note: Note, position: Int, deleteNote: ImageButton)

    fun onLongClick(view: View, note: Note, deleteNote: ImageButton): Boolean {
        return true
    }
}
