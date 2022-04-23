package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ToursDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDepartment(tour: Tours)

    @Delete
    fun deleteDTours(tour: Tours)

    @Update
    fun updateTours(tour: Tours)

    @Query("SELECT * FROM Tours_table")
    fun readData(): LiveData<List<Tours>>



}