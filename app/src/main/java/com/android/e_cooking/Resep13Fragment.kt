package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep13.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep13Fragment : Fragment(R.layout.fragment_resep13) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button13.setOnClickListener {
            val action = Resep13FragmentDirections.actionResep13FragmentToLangkah13Fragment()
            findNavController().navigate(action)
        }
    }
}