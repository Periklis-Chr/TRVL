package com.iee.trvl.ui.offices

import androidx.lifecycle.*
import androidx.room.Room
import com.iee.trvl.entities.Departments
import com.iee.trvl.entities.DepartmentsRepository
import com.iee.trvl.entities.TrvlDatabase

class OfficesViewModel() : ViewModel() {





    private val _text = MutableLiveData<String>().apply {
        value = "This is offices Fragment"
    }
    val text: LiveData<String> = _text









}