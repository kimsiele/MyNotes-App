package com.developerkim.mytodo.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
import java.util.*

/*Create data class for note category*/

@Entity(tableName = "notes_categories_table")
data class NoteCategory (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "category_name")var categoryName: String = "",
    @ColumnInfo(name = "category_notes")var notes:MutableList<Note>? = null
)
class Converter{
    @TypeConverter
    fun listToJson(value: MutableList<Note>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String):MutableList<Note> =
        (Gson().fromJson(value, Array<Note>::class.java) as Array<Note>).toMutableList()

}

