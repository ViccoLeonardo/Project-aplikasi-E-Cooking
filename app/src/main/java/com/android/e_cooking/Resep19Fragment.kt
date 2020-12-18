package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep19.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep19Fragment : Fragment(R.layout.fragment_resep19) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button19.setOnClickListener {
            val action = Resep19FragmentDirections.actionResep19FragmentToLangkah19Fragment()
            findNavController().navigate(action)
        }
    }
}