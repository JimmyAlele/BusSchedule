package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository (private val busScheduleDao: BusScheduleDao): BusScheduleRepository {
    override fun getAllItemsStream(): Flow<List<BusSchedule>> = busScheduleDao.getAllItems()

    override fun getItemStream(stopName: String): Flow<List<BusSchedule>> = busScheduleDao.getItem(stopName)
}