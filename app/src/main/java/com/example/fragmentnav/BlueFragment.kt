package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragmentnav.databinding.FragmentBlueBinding

class BlueFragment : Fragment() {
    private lateinit var binding: FragmentBlueBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blue, container, false)

        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blue, container, false)
    }

}