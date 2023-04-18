package com.gdscuoc.csdnotes.data.repositories

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gdscuoc.csdnotes.data.db.AppDatabase

class NotesRepository(private val context: Context) {

    var db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "gdsc-notes-db"
    ).build()

}