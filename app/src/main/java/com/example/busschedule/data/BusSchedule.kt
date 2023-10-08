package com.example.busschedule.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 */
@Entity(tableName = "busSchedule")
data class BusSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val stopName: String,
    val arrivalTimeInMillis: Int
)
