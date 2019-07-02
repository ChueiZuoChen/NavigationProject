package com.cz.navigationproject.display


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.cz.navigationproject.R
import com.cz.navigationproject.databinding.FragmentDisplayBinding
import kotlinx.android.synthetic.main.fragment_display.*


class DisplayFragment : Fragment() {
    lateinit var binding: FragmentDisplayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display,container,false)

        val mylist = listOf<Item>(
            Item("1","a"),
            Item("2","b"),
            Item("3","c"),
            Item("4","d"),
            Item("5","e"),
            Item("6","f"),
            Item("7","g"),
            Item("8","h"),
            Item("9","i"),
            Item("10","j"),
            Item("11","k"),
            Item("12","l"),
            Item("13","m")
        )


        val adapter = ShowAdapter(mylist)

        binding.recyclerDisplay.layoutManager = LinearLayoutManager(context)
        binding.recyclerDisplay.setHasFixedSize(true)
        binding.recyclerDisplay.adapter = adapter

        binding.buttonHome.setOnClickListener {
            it.findNavController().navigate(R.id.action_displayFragment_to_homeFragment)
        }
        return binding.root
    }


}
