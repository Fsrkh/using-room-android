package com.example.usingroom.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/usingroom/db/NotesDao;", "", "deleteNote", "", "noteEntity", "Lcom/example/usingroom/db/NoteEntity;", "getAllNotes", "", "getNote", "id", "", "insertNote", "updateNote", "app_debug"})
public abstract interface NotesDao {
    
    @androidx.room.Insert
    public abstract void insertNote(@org.jetbrains.annotations.NotNull
    com.example.usingroom.db.NoteEntity noteEntity);
    
    @androidx.room.Update
    public abstract void updateNote(@org.jetbrains.annotations.NotNull
    com.example.usingroom.db.NoteEntity noteEntity);
    
    @androidx.room.Delete
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull
    com.example.usingroom.db.NoteEntity noteEntity);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM note_table ORDER BY noteId DESC")
    public abstract java.util.List<com.example.usingroom.db.NoteEntity> getAllNotes();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM note_table WHERE noteId LIKE:id")
    public abstract com.example.usingroom.db.NoteEntity getNote(int id);
}