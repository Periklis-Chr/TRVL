package com.iee.trvl.entities

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface DepartmentsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDepartment(department: Departments)



    @Query("SELECT * FROM Departments_table")
    fun readData(): LiveData<List<Departments>>

}