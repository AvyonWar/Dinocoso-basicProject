package com.example.dinocoso_prefatta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dinocoso_prefatta.adapter.ItemAdapter
import com.example.dinocoso_prefatta.data.Datasource
import com.example.dinocoso_prefatta.databinding.FragmentSevenBinding


class SevenFragment : Fragment() {

    private var _binding: FragmentSevenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSevenBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

        //=== RECYCLER VIEW - START ================================================================================

        //---riferimento recyclerView all'interno del Layout--------------------------------------------

        val myDataset = Datasource().loadImageTextView()
        val recyclerView = binding.recyclerViewSeven

        //---ricyclerView usa itemAdapter che ho creato-------------------------------------------------

        recyclerView.adapter = ItemAdapter(this, myDataset)

        //---prestazioni--------------------------------------------------------------------------------

        recyclerView.setHasFixedSize(true)

//=== RECYCLER VIEW - END ===============================================================================================



    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }
