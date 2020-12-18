package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_halaman2.*
import kotlinx.android.synthetic.main.fragment_halaman3.*
import kotlinx.android.synthetic.main.fragment_halaman4.*
import kotlinx.android.synthetic.main.fragment_home.*

class Halaman4Fragment : Fragment(R.layout.fragment_halaman4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rsp13.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToResep13Fragment()
            findNavController().navigate(action)
        }

        rsp14.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToResep14Fragment()
            findNavController().navigate(action)
        }

        rsp15.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToResep15Fragment()
            findNavController().navigate(action)
        }

        rsp16.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToResep16Fragment()
            findNavController().navigate(action)
        }

        btn4.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToHalaman5Fragment()
            findNavController().navigate(action)
        }

        btnbck3.setOnClickListener {
            val action = Halaman4FragmentDirections.actionHalaman4FragmentToHalaman3Fragment()
            findNavController().navigate(action)
        }
    }


}