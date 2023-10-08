package com.example.busschedule.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.BusScheduleApplication
import com.example.busschedule.data.BusSchedule
import com.example.busschedule.data.BusScheduleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class BusScheduleViewModel (
    private val busScheduleRepository: BusScheduleRepository
): ViewModel() {

    // You must run database operations inside a coroutine.
    fun getFullSchedule(): Flow<List<BusSchedule>> = busScheduleRepository.getAllItemsStream()

    // You must run database operations inside a coroutine.
    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> = busScheduleRepository.getItemStream(stopName)

    companion object {
        val factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                BusScheduleViewModel(busScheduleApplication().container.busScheduleRepository)
            }
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [BusScheduleApplication].
 */
fun CreationExtras.busScheduleApplication(): BusScheduleApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BusScheduleApplication)