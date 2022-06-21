package com.example.odevuc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odevuc.databinding.FragmentSayfaAaBinding
import com.example.odevuc.databinding.FragmentSayfaBbBinding


class SayfaBbFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaBbBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaBbBinding.inflate(inflater, container, false)

        tasarim.buttonYeye2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bdenYyeGecis)
        }


        return tasarim.root
    }


}