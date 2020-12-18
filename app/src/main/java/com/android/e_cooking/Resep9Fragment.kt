package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep9.*

class Resep9Fragment : Fragment(R.layout.fragment_resep9) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button9.setOnClickListener {
            val action = Resep9FragmentDirections.actionResep9FragmentToLangkah9Fragment()
            findNavController().navigate(action)
        }
    }
}