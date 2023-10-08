package com.example.busschedule.data

import android.content.Context

/**
 * App container for Dependency injection.
 */
interface AppContainer {
    val busScheduleRepository: BusScheduleRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineBusScheduleRepository]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [BusScheduleRepository]
     */
    override val busScheduleRepository: BusScheduleRepository by lazy {
        OfflineBusScheduleRepository(BusScheduleDatabase.getDatabase(context).busScheduleDao())
    }
}