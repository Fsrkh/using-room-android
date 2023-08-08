package com.example.usingroom.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NotesDao_Impl implements NotesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NoteEntity> __insertionAdapterOfNoteEntity;

  private final EntityDeletionOrUpdateAdapter<NoteEntity> __deletionAdapterOfNoteEntity;

  private final EntityDeletionOrUpdateAdapter<NoteEntity> __updateAdapterOfNoteEntity;

  public NotesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteEntity = new EntityInsertionAdapter<NoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `note_table` (`noteId`,`note_title`,`note_descrip`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteEntity value) {
        stmt.bindLong(1, value.getNoteId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteDesc());
        }
      }
    };
    this.__deletionAdapterOfNoteEntity = new EntityDeletionOrUpdateAdapter<NoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `note_table` WHERE `noteId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteEntity value) {
        stmt.bindLong(1, value.getNoteId());
      }
    };
    this.__updateAdapterOfNoteEntity = new EntityDeletionOrUpdateAdapter<NoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `note_table` SET `noteId` = ?,`note_title` = ?,`note_descrip` = ? WHERE `noteId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteEntity value) {
        stmt.bindLong(1, value.getNoteId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteDesc());
        }
        stmt.bindLong(4, value.getNoteId());
      }
    };
  }

  @Override
  public void insertNote(final NoteEntity noteEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteEntity.insert(noteEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNote(final NoteEntity noteEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNoteEntity.handle(noteEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateNote(final NoteEntity noteEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNoteEntity.handle(noteEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<NoteEntity> getAllNotes() {
    final String _sql = "SELECT * FROM note_table ORDER BY noteId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "noteId");
      final int _cursorIndexOfNoteTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "note_title");
      final int _cursorIndexOfNoteDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "note_descrip");
      final List<NoteEntity> _result = new ArrayList<NoteEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteEntity _item;
        final int _tmpNoteId;
        _tmpNoteId = _cursor.getInt(_cursorIndexOfNoteId);
        final String _tmpNoteTitle;
        if (_cursor.isNull(_cursorIndexOfNoteTitle)) {
          _tmpNoteTitle = null;
        } else {
          _tmpNoteTitle = _cursor.getString(_cursorIndexOfNoteTitle);
        }
        final String _tmpNoteDesc;
        if (_cursor.isNull(_cursorIndexOfNoteDesc)) {
          _tmpNoteDesc = null;
        } else {
          _tmpNoteDesc = _cursor.getString(_cursorIndexOfNoteDesc);
        }
        _item = new NoteEntity(_tmpNoteId,_tmpNoteTitle,_tmpNoteDesc);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public NoteEntity getNote(final int id) {
    final String _sql = "SELECT * FROM note_table WHERE noteId LIKE?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "noteId");
      final int _cursorIndexOfNoteTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "note_title");
      final int _cursorIndexOfNoteDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "note_descrip");
      final NoteEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpNoteId;
        _tmpNoteId = _cursor.getInt(_cursorIndexOfNoteId);
        final String _tmpNoteTitle;
        if (_cursor.isNull(_cursorIndexOfNoteTitle)) {
          _tmpNoteTitle = null;
        } else {
          _tmpNoteTitle = _cursor.getString(_cursorIndexOfNoteTitle);
        }
        final String _tmpNoteDesc;
        if (_cursor.isNull(_cursorIndexOfNoteDesc)) {
          _tmpNoteDesc = null;
        } else {
          _tmpNoteDesc = _cursor.getString(_cursorIndexOfNoteDesc);
        }
        _result = new NoteEntity(_tmpNoteId,_tmpNoteTitle,_tmpNoteDesc);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
