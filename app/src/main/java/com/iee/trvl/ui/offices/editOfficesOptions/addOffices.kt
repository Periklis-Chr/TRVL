package com.iee.trvl.ui.offices.editOfficesOptions

import android.os.Bundle
import com.iee.trvl.ui.offices.editOfficesOptions.addOffices
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iee.trvl.R
import com.iee.trvl.entities.Departments
import com.iee.trvl.ui.offices.OfficesViewModel


class addOffices : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_offices, container, false)

    }
}