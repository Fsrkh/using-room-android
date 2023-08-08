package com.example.usingroom.uii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.usingroom.R
import com.example.usingroom.adapter.NoteAdapter
import com.example.usingroom.databinding.ActivityMainBinding
import com.example.usingroom.db.NoteDatabase
import com.example.usingroom.utils.Constants
import com.example.usingroom.utils.Constants.NOTE_DATABASE

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    // creating object of our database
    private val noteDB : NoteDatabase by lazy {
        Room.databaseBuilder(this,NoteDatabase::class.java,NOTE_DATABASE)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
    private val noteAdapter by lazy { NoteAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

        binding.btnAddNote.setOnClickListener {
            startActivity(Intent(this,AddNoteActivity::class.java))
        }
    }

    // In future, Use LiveData in place of this function
    override fun onResume() {
        super.onResume()
        checkItem()
    }

    private fun checkItem(){
        if(noteDB.dao().getAllNotes().isNotEmpty()){
            binding.rvNoteList.visibility= View.VISIBLE
            binding.tvEmptyText.visibility=View.GONE
            noteAdapter.differ.submitList(noteDB.dao().getAllNotes())
        } else {
            binding.rvNoteList.visibility=View.GONE
            binding.tvEmptyText.visibility=View.VISIBLE
        }
    }

    private fun setupRecyclerView(){
        binding.rvNoteList.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=noteAdapter
        }

    }

    }


