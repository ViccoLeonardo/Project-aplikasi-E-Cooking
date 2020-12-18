package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_halaman2.*
import kotlinx.android.synthetic.main.fragment_halaman3.*
import kotlinx.android.synthetic.main.fragment_home.*

class Halaman3Fragment : Fragment(R.layout.fragment_halaman3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rsp9.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToResep9Fragment()
            findNavController().navigate(action)
        }

        rsp10.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToResep10Fragment()
            findNavController().navigate(action)
        }

        rsp11.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToResep11Fragment()
            findNavController().navigate(action)
        }

        rsp12.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToResep12Fragment()
            findNavController().navigate(action)
        }

        btn3.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToHalaman4Fragment()
            findNavController().navigate(action)
        }

        btnbck2.setOnClickListener {
            val action = Halaman3FragmentDirections.actionHalaman3FragmentToHalaman2Fragment()
            findNavController().navigate(action)
        }

    }

}