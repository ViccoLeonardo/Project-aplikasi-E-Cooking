package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep1.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep2Fragment : Fragment(R.layout.fragment_resep2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2.setOnClickListener {
            val action = Resep2FragmentDirections.actionResep2FragmentToLangkah2Fragment()
            findNavController().navigate(action)
        }
    }
}