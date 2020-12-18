package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep17.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep17Fragment : Fragment(R.layout.fragment_resep17) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button17.setOnClickListener {
            val action = Resep17FragmentDirections.actionResep17FragmentToLangkah17Fragment()
            findNavController().navigate(action)
        }
    }
}