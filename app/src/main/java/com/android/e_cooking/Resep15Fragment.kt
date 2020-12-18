package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep15.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep15Fragment : Fragment(R.layout.fragment_resep15) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button15.setOnClickListener {
            val action = Resep15FragmentDirections.actionResep15FragmentToLangkah15Fragment()
            findNavController().navigate(action)
        }
    }
}