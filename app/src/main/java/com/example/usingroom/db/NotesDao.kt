package com.example.usingroom.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.usingroom.utils.Constants.NOTE_TABLE

@Dao
interface NotesDao {
    @Insert
    fun insertNote (noteEntity: NoteEntity)

    @Update
    fun updateNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM $NOTE_TABLE ORDER BY noteId DESC")
    fun getAllNotes (): MutableList<NoteEntity>

    @Query("SELECT * FROM $NOTE_TABLE WHERE noteId LIKE:id")
    fun getNote (id:Int) : NoteEntity
}