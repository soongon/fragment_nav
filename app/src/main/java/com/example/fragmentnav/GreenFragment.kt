package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragmentnav.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private lateinit var binding: FragmentGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // data binding way
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_green, container, false)



        return binding.root

        // Inflate the layout for this fragment (Old way)
        //return inflater.inflate(R.layout.fragment_green, container, false)
    }


}