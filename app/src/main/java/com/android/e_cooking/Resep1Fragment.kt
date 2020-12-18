package com.android.e_cooking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_resep1.*

class Resep1Fragment : Fragment(R.layout.fragment_resep1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1.setOnClickListener {
            val action = Resep1FragmentDirections.actionResep1FragmentToLangkah1Fragment()
            findNavController().navigate(action)
        }
    }
}