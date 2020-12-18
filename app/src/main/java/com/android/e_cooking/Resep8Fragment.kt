package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep8.*

class Resep8Fragment : Fragment(R.layout.fragment_resep8) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button8.setOnClickListener {
            val action = Resep8FragmentDirections.actionResep8FragmentToLangkah8Fragment()
            findNavController().navigate(action)
        }
    }
}