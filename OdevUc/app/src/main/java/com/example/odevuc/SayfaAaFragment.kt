package com.example.odevuc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odevuc.databinding.FragmentAnasayfaBinding
import com.example.odevuc.databinding.FragmentSayfaAaBinding


class SayfaAaFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaAaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentSayfaAaBinding.inflate(inflater, container, false)

        tasarim.buttonBeye2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.BbEkraninaGecis)
        }


        return tasarim.root
    }


}