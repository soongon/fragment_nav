package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentnav.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private lateinit var binding: FragmentGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // data binding way
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_green, container, false)

        // get passed data from Blue
        val args = BlueFragmentArgs.fromBundle(requireArguments())
        binding.greenFragmentTvMessage.text = "${args.currentMessage}\n${args.passedMessage}"

        binding.greenFragmentBtNext.setOnClickListener { buttonClicked() }

        return binding.root

        // Inflate the layout for this fragment (Old way)
        //return inflater.inflate(R.layout.fragment_green, container, false)
    }

    private fun buttonClicked() {
        //findNavController().navigate(R.id.action_greenFragment_to_redFragment)
        findNavController().navigate(GreenFragmentDirections.actionGreenFragmentToRedFragment(
            binding.greenFragmentEtName.text.toString(),
            binding.greenFragmentTvMessage.text.toString()
        ))
    }


}