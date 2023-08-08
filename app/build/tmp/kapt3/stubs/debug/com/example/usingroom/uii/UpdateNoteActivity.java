package com.example.usingroom.uii;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/usingroom/uii/UpdateNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/usingroom/databinding/ActivityUpdateBinding;", "defaultDesc", "", "defaultTitle", "noteDB", "Lcom/example/usingroom/db/NoteDatabase;", "getNoteDB", "()Lcom/example/usingroom/db/NoteDatabase;", "noteDB$delegate", "Lkotlin/Lazy;", "noteEntity", "Lcom/example/usingroom/db/NoteEntity;", "noteId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class UpdateNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.usingroom.databinding.ActivityUpdateBinding binding;
    private final kotlin.Lazy noteDB$delegate = null;
    private com.example.usingroom.db.NoteEntity noteEntity;
    private int noteId = 0;
    private java.lang.String defaultTitle = "";
    private java.lang.String defaultDesc = "";
    
    public UpdateNoteActivity() {
        super();
    }
    
    private final com.example.usingroom.db.NoteDatabase getNoteDB() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}