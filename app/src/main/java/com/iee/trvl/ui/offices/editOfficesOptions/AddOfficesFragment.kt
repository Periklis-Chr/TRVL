package com.iee.trvl.ui.offices.editOfficesOptions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.iee.trvl.databinding.FragmentAddOfficesBinding


class AddOfficesFragment : Fragment() {


    private var _binding: FragmentAddOfficesBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentAddOfficesBinding.inflate(inflater, container, false)
        val root: View = binding.root








        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add_offices, container, false)
return root
    }
}