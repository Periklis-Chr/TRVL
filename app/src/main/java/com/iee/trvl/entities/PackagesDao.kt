package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PackagesDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDepartment(packages: Packages)



    @Query("SELECT * FROM Packages_table")
    fun readData(): LiveData<List<Packages>>




}