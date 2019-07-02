package com.cz.navigationproject.add


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.cz.navigationproject.R
import com.cz.navigationproject.databinding.FragmentAddBinding


class AddFragment : Fragment() {
    lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add,container,false)
        binding.buttonDisplay.setOnClickListener {
            it.findNavController().navigate(R.id.action_addFragment_to_displayFragment)
        }
        return binding.root
    }


}
