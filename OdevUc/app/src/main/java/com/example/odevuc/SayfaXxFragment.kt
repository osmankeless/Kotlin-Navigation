package com.example.odevuc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odevuc.databinding.FragmentSayfaBbBinding
import com.example.odevuc.databinding.FragmentSayfaXxBinding


class SayfaXxFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaXxBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaXxBinding.inflate(inflater, container, false)

        tasarim.buttonYye2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.XtenYyeGecis)
        }


        return tasarim.root

    }
}