package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep14.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep14Fragment : Fragment(R.layout.fragment_resep14) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button14.setOnClickListener {
            val action = Resep14FragmentDirections.actionResep14FragmentToLangkah14Fragment()
            findNavController().navigate(action)
        }
    }
}