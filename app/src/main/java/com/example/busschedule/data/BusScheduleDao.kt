package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * from busSchedule ORDER BY arrivalTimeInMillis ASC")
    fun getAllItems(): Flow<List<BusSchedule>>

    @Query("SELECT * from busSchedule WHERE stopName = :stopName ORDER BY arrivalTimeInMillis ASC")
    fun getItem(stopName: String): Flow<BusSchedule>
}