@file:Suppress("UNREACHABLE_CODE")

package com.example.dinocoso_prefatta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dinocoso_prefatta.databinding.FragmentFiveBinding
import com.example.dinocoso_prefatta.databinding.FragmentSixBinding


class sixFragment : Fragment() {

    private var _binding: FragmentSixBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSixBinding.inflate(inflater, container, false)


        binding.bEnter.setOnClickListener{
            binding.titleDino.text = binding.nameEnter.text
        }
        return binding.root

    }

//da cancellare?
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
