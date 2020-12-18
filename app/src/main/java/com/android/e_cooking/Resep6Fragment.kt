package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep6.*

class Resep6Fragment : Fragment(R.layout.fragment_resep6) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button6.setOnClickListener {
            val action = Resep6FragmentDirections.actionResep6FragmentToLangkah6Fragment()
            findNavController().navigate(action)
        }
    }
}