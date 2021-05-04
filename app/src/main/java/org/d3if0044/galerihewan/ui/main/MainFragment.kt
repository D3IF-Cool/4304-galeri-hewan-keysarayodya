package org.d3if0044.galerihewan.ui.main

import Hewan
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0044.galerihewan.R
import org.d3if0044.galerihewan.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa, "Unggas"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam, "Unggas"),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek, "Unggas"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba, "Mamalia"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun, "Unggas"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing, "Mamalia"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci, "Mamalia"),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau, "Mamalia"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda, "Mamalia"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi, "Mamalia")
        )
    }
}