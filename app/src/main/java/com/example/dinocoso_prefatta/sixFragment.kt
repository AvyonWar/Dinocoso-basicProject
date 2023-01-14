@file:Suppress("UNREACHABLE_CODE")

package com.example.dinocoso_prefatta

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.navigation.fragment.findNavController
import com.example.dinocoso_prefatta.databinding.FragmentSixBinding
import com.google.android.material.snackbar.Snackbar


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
        return binding.root

        //---nascondere la tastiera.---------------------------------------------------------------
        fun View.hideKeyboard() {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(windowToken, 0)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bEnter.setOnClickListener {
            binding.titleDino.text = binding.nameEnterEditText.text
        }
             Snackbar.make(
                    binding.bAbout,
                    "Hello! my name is Dinocoso; and yours?",
                    Snackbar.LENGTH_SHORT
                ).show()

        binding.bAbout.setOnClickListener {
            findNavController().navigate(R.id.action_sixFragment_to_sevenFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }
