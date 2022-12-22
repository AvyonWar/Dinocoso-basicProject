package com.example.dinocoso_prefatta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dinocoso_prefatta.databinding.FragmentSecondBinding
import com.example.dinocoso_prefatta.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
// bottone x ritornare alla pag precedente
        binding.bPrevious3.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment2_to_SecondFragment)
        }
        //----- bottone per andare nella pag successiva
        binding.bNext3.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_fourFragment)
                  }
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
