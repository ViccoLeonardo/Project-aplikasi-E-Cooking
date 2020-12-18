package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep3.*

class Resep3Fragment : Fragment(R.layout.fragment_resep3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button3.setOnClickListener {
            val action = Resep3FragmentDirections.actionResep3FragmentToLangkah3Fragment()
            findNavController().navigate(action)
        }
    }
}