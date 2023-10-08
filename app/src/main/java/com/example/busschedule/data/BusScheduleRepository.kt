package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow


/**
 * Repository that provides insert, update, delete, and retrieve of [BusSchedule] from a given data source.
 */
interface BusScheduleRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllItemsStream(): Flow<List<BusSchedule>>

    /**
     * Retrieve an item from the given data source that matches with the [stopName].
     */
    fun getItemStream(stopName: String): Flow<List<BusSchedule>>
}