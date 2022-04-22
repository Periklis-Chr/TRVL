package com.iee.trvl.entities

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities =  [Departments::class,Tours::class,Packages::class],version = 1,exportSchema = false)
abstract class TrvlDatabase:RoomDatabase() {


    abstract fun DepartmentsDao(): DepartmentsDao
    abstract fun ToursDao(): ToursDao
    abstract fun PackagesDao(): PackagesDao


    companion object {
        @Volatile
        private var INSTANCE: TrvlDatabase? = null

        fun getDatabase(context: Context): TrvlDatabase {
            val tempInsance = INSTANCE
            if (tempInsance != null) {
                return tempInsance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TrvlDatabase::class.java,
                    "database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }






}