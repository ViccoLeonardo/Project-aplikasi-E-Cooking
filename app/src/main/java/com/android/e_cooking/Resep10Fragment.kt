package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep10.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep10Fragment : Fragment(R.layout.fragment_resep10) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button10.setOnClickListener {
            val action = Resep10FragmentDirections.actionResep10FragmentToLangkah10Fragment()
            findNavController().navigate(action)
        }
    }
}