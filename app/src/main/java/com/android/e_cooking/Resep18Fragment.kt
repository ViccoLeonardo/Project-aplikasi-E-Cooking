package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep18.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep18Fragment : Fragment(R.layout.fragment_resep18) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button18.setOnClickListener {
            val action = Resep18FragmentDirections.actionResep18FragmentToLangkah18Fragment()
            findNavController().navigate(action)
        }
    }
}