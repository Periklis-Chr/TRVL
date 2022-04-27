package com.iee.trvl.ui.offices

import androidx.lifecycle.*

class OfficesViewModel() : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is offices Fragment"
    }
    val text: LiveData<String> = _text




}