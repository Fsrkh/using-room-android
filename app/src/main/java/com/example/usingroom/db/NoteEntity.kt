package com.example.usingroom.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.usingroom.utils.Constants.NOTE_TABLE


@Entity(tableName = NOTE_TABLE)
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val noteId : Int,
    @ColumnInfo(name = "note_title")
    val noteTitle : String,
    @ColumnInfo(name = "note_descrip")
    val noteDesc : String,
)
