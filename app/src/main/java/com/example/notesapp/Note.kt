package com.example.notesapp

import android.icu.text.CaseMap
import androidx.compose.runtime.snapshots.SnapshotId
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String
)
