package com.example.busschedule.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 * Prep-populated database already has a table named schedule in it ???
 */
@Entity(tableName = "schedule")
data class BusSchedule(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "stop_name")
    val stopName: String,
    @ColumnInfo(name = "arrival_time")
    val arrivalTimeInMillis: Int
)
