package com.example.busschedule.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * // Song and Album are classes annotated with @Entity.
 * @Database(version = 1, entities = [Song::class, Album::class])
 * abstract class MusicDatabase : RoomDatabase {
 *   // SongDao is a class annotated with @Dao.
 *   abstract fun getSongDao(): SongDao
 *
 *   // AlbumDao is a class annotated with @Dao.
 *   abstract fun getArtistDao(): ArtistDao
 *
 *   // SongAlbumDao is a class annotated with @Dao.
 *   abstract fun getSongAlbumDao(): SongAlbumDao
 * }
 */
@Database(entities =[BusSchedule::class], version = 1)
abstract class BusScheduleDatabase: RoomDatabase() {
    abstract fun busScheduleDao(): BusScheduleDao

    companion object{
        @Volatile
        private var Instance: BusScheduleDatabase? = null

        fun getDatabase(context: Context): BusScheduleDatabase {
            // if the Instance is not null, return it, otherwise create a new database instance.
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, BusScheduleDatabase::class.java, "bS_database")
                    //.createFromFile(File("database/bus_schedule.db"))
                    .createFromAsset("database/bus_schedule.db")
                    .fallbackToDestructiveMigration()
                    .build().also { Instance = it }
            }
        }
    }
}
