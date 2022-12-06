package com.devpass.spaceapp.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.devpass.spaceapp.R
import com.devpass.spaceapp.databinding.FragmentLaunchListBinding
import com.devpass.spaceapp.presentation.adapters.CustomAdapter

class LaunchListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLaunchListBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_launch_list,
            container,
            false
        )

        val recyclerView = binding.recyclerView
        val adapter = CustomAdapter(arrayOf("a", "b", "c"))
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return binding.root
    }
}