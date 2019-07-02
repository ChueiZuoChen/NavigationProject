package com.cz.navigationproject.add


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.cz.navigationproject.Item
import com.cz.navigationproject.R
import com.cz.navigationproject.databinding.FragmentAddBinding


class AddFragment : Fragment() {
    lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mylist = arrayOf(Item("a","2"), Item("b","3"), Item("3","a"))


        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)
        binding.buttonDisplay.setOnClickListener {
            //it.findNavController().navigate(R.id.action_addFragment_to_displayFragment)
            it.findNavController().navigate(AddFragmentDirections.actionAddFragmentToDisplayFragment(mylist = mylist))

        }
        return binding.root
    }


}
