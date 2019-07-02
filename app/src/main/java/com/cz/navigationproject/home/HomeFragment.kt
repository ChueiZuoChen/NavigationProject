package com.cz.navigationproject.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.cz.navigationproject.R
import com.cz.navigationproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)
        binding.buttonAdd.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_addFragment)
        }
        return binding.root
    }


}
