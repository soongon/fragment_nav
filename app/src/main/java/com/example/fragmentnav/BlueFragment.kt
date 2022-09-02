package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentnav.databinding.FragmentBlueBinding

class BlueFragment : Fragment() {
    private lateinit var binding: FragmentBlueBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blue, container, false)

        // get passed data from bundle
        var args = RedFragmentArgs.fromBundle(requireArguments())
        binding.blueFragmentTvMessage.text = "${args.currentMessage}\n${args.passedMessage}"

        binding.blueFragmentBtNext.setOnClickListener { buttonClicked() }

        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    private fun buttonClicked() {
        //findNavController().navigate(R.id.action_blueFragment_to_greenFragment)
        findNavController().navigate(BlueFragmentDirections.actionBlueFragmentToGreenFragment(
            binding.blueFragmentEtName.text.toString(),
            binding.blueFragmentTvMessage.text.toString()
        ))
    }

}