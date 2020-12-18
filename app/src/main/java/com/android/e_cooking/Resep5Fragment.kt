package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_resep2.*
import kotlinx.android.synthetic.main.fragment_resep2.button2
import kotlinx.android.synthetic.main.fragment_resep5.*

class Resep5Fragment : Fragment(R.layout.fragment_resep5) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button5.setOnClickListener {
            val action = Resep5FragmentDirections.actionResep5FragmentToLangkah5Fragment()
            findNavController().navigate(action)
        }
    }
}