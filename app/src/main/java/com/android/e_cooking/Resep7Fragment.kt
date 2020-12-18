package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep7.*

class Resep7Fragment : Fragment(R.layout.fragment_resep7) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button7.setOnClickListener {
            val action = Resep7FragmentDirections.actionResep7FragmentToLangkah7Fragment()
            findNavController().navigate(action)
        }
    }
}