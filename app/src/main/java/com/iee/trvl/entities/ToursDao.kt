package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ToursDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDepartment(tour: Tours)



    @Query("SELECT * FROM Tours_table")
    fun readData(): LiveData<List<Tours>>



}