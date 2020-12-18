package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rsp1.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToResep1Fragment()
            findNavController().navigate(action)
        }

        rsp2.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToResep2Fragment()
            findNavController().navigate(action)
        }

        rsp3.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToResep3Fragment()
            findNavController().navigate(action)
        }

        rsp4.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToResep4Fragment()
            findNavController().navigate(action)
        }

        btn1.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToHalaman2Fragment()
            findNavController().navigate(action)
        }

    }

}