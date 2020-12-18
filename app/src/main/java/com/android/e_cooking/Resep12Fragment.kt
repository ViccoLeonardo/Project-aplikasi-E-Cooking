package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep12.*
import kotlinx.android.synthetic.main.fragment_resep2.*

class Resep12Fragment : Fragment(R.layout.fragment_resep12) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button12.setOnClickListener {
            val action = Resep12FragmentDirections.actionResep12FragmentToLangkah12Fragment()
            findNavController().navigate(action)
        }
    }
}