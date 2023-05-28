package com.celtic.furniplan.ui.get_started

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.celtic.furniplan.R
import com.celtic.furniplan.databinding.FragmentGetStartedBinding

class GetStartedFragment: Fragment() {
    private lateinit var binding: FragmentGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGetStartedBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignup.setOnClickListener {
            it.findNavController().navigate(
                R.id.action_getStartedFragment_to_signUpFragment2
            )
        }
        binding.btnLogin.setOnClickListener {
            it.findNavController().navigate(
                R.id.action_getStartedFragment_to_loginFragment2
            )
        }
    }
}