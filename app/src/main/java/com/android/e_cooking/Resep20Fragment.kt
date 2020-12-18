package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep20.*

class Resep20Fragment : Fragment(R.layout.fragment_resep20) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button20.setOnClickListener {
            val action = Resep20FragmentDirections.actionResep20FragmentToLangkah20Fragment()
            findNavController().navigate(action)
        }
    }
}