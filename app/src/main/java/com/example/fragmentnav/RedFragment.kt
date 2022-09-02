package com.example.fragmentnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragmentnav.databinding.FragmentRedBinding

class RedFragment : Fragment() {

    private lateinit var binding: FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // data binding way
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_red, container, false)

        binding.redFragmentBtNext.setOnClickListener { buttonClicked() }

        return binding.root
        // Inflate the layout for this fragment (old way)
        // return inflater.inflate(R.layout.fragment_red, container, false)
    }
    private fun buttonClicked() {
        // edit text 에 적힌 글자를 가져와서 text view 에 표시해 준다.
        val messageFromEditText = binding.redFragmentEtMessage.text.toString()
        binding.redFragmentTvMessage.text = "$messageFromEditText from edit text"
    }
}