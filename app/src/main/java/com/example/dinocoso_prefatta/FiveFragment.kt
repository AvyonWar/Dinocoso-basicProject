package com.example.dinocoso_prefatta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dinocoso_prefatta.databinding.FragmentFiveBinding
import com.example.dinocoso_prefatta.databinding.FragmentSecondBinding
import com.example.dinocoso_prefatta.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FiveFragment : Fragment() {

    private var _binding: FragmentFiveBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFiveBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
// bottone x ritornare alla pag precedente
        binding.bHome.setOnClickListener {
            findNavController().navigate(R.id.action_fiveFragment_to_FirstFragment)
        }

        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
