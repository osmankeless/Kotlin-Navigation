package com.example.odevuc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odevuc.databinding.FragmentSayfaXxBinding
import com.example.odevuc.databinding.FragmentSayfaYyBinding

class SayfaYyFragment : Fragment() {


    private lateinit var tasarim:FragmentSayfaYyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { tasarim = FragmentSayfaYyBinding.inflate(inflater, container, false)

        tasarim.buttonGeri2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.geriGecis)
        }


        return tasarim.root
    }


}