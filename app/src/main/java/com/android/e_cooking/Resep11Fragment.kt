package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep11.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep11Fragment : Fragment(R.layout.fragment_resep11) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button11.setOnClickListener {
            val action = Resep11FragmentDirections.actionResep11FragmentToLangkah11Fragment()
            findNavController().navigate(action)
        }
    }
}