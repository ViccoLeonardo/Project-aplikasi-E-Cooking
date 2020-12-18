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
import kotlinx.android.synthetic.main.fragment_halaman5.*
import kotlinx.android.synthetic.main.fragment_home.*

class Halaman5Fragment : Fragment(R.layout.fragment_halaman5) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rsp17.setOnClickListener {
            val action = Halaman5FragmentDirections.actionHalaman5FragmentToResep17Fragment()
            findNavController().navigate(action)
        }

        rsp18.setOnClickListener {
            val action = Halaman5FragmentDirections.actionHalaman5FragmentToResep18Fragment()
            findNavController().navigate(action)
        }

        rsp19.setOnClickListener {
            val action = Halaman5FragmentDirections.actionHalaman5FragmentToResep19Fragment()
            findNavController().navigate(action)
        }

        rsp20.setOnClickListener {
            val action = Halaman5FragmentDirections.actionHalaman5FragmentToResep20Fragment()
            findNavController().navigate(action)
        }

        btnbck4.setOnClickListener {
            val action = Halaman5FragmentDirections.actionHalaman5FragmentToHalaman4Fragment()
            findNavController().navigate(action)
        }
    }

}