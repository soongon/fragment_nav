package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentnav.databinding.FragmentRedBinding

class RedFragment : Fragment() {

    private lateinit var binding: FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // data binding way
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_red, container, false)

        // get passed data from Green
        val args = GreenFragmentArgs.fromBundle(requireArguments())
        binding.redFragmentTvMessage.text = "${args.currentMessage}\n${args.passedMessage}"

        binding.redFragmentBtNext.setOnClickListener { buttonClicked() }

        return binding.root
        // Inflate the layout for this fragment (old way)
        // return inflater.inflate(R.layout.fragment_red, container, false)
    }
    private fun buttonClicked() {

        // safe args 사용하지 않을 때 코드..
        //findNavController().navigate(R.id.action_redFragment_to_blueFragment)

        // safe args 방식
        findNavController().navigate(RedFragmentDirections.actionRedFragmentToBlueFragment(
            binding.redFragmentEtMessage.text.toString(),
            binding.redFragmentTvMessage.text.toString()
        ))
    }
}