package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep16.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep16Fragment : Fragment(R.layout.fragment_resep16) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button16.setOnClickListener {
            val action = Resep16FragmentDirections.actionResep16FragmentToLangkah16Fragment()
            findNavController().navigate(action)
        }
    }
}