package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep4.*

class Resep4Fragment : Fragment(R.layout.fragment_resep4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button4.setOnClickListener {
            val action = Resep4FragmentDirections.actionResep4FragmentToLangkah4Fragment()
            findNavController().navigate(action)
        }
    }
}