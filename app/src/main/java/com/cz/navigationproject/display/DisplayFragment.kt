package com.cz.navigationproject.display


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.cz.navigationproject.Item
import com.cz.navigationproject.R
import com.cz.navigationproject.databinding.FragmentDisplayBinding
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info


class DisplayFragment : Fragment(), AnkoLogger {
    lateinit var binding: FragmentDisplayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display, container, false)

        val args = arguments?.let { DisplayFragmentArgs.fromBundle(it).mylist }
//        info(args?.get(1)?.title)
        val adapter = ShowAdapter(args!!)

        binding.recyclerDisplay.layoutManager = LinearLayoutManager(context)
        binding.recyclerDisplay.setHasFixedSize(true)
        binding.recyclerDisplay.adapter = adapter

        binding.buttonHome.setOnClickListener {
            it.findNavController().navigate(R.id.action_displayFragment_to_homeFragment)
        }
        return binding.root
    }


}
