package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_halaman2.*
import kotlinx.android.synthetic.main.fragment_home.*

class Halaman2Fragment : Fragment(R.layout.fragment_halaman2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rsp5.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToResep5Fragment()
            findNavController().navigate(action)
        }

        rsp6.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToResep6Fragment()
            findNavController().navigate(action)
        }

        rsp7.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToResep7Fragment2()
            findNavController().navigate(action)
        }

        rsp8.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToResep8Fragment2()
            findNavController().navigate(action)
        }

        btn2.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToHalaman3Fragment()
            findNavController().navigate(action)
        }

        btnbck1.setOnClickListener {
            val action = Halaman2FragmentDirections.actionHalaman2FragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }

}