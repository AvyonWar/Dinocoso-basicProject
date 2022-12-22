package com.example.dinocoso_prefatta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.dinocoso_prefatta.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar
import java.nio.file.Files.find

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonChange() // rendere visibile l'immagine random quando si apre l'app
        binding.buttonStartToStory.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }


        //--------------------------------------------------------------------------------------------------
//BOTTONE -> TOAST
        binding.buttonChangeImage.setOnClickListener {view ->

            Toast.makeText( requireContext(), "The story of my life ...", Toast.LENGTH_SHORT).show()
            // Toast.makeText(this, "keep pressing !!", Toast.LENGTH_SHORT).show()
            buttonChange() // uso del bottone

        }
        //FINE
    }

    // botone random --< START
    private fun buttonChange() {
        val d2 = DiceDino(2)
        val diceRoll = d2.roll()
        val diceImage: ImageView = binding.imageView

        val diceImageDino = when (diceRoll) {
            1 -> R.drawable.dino
            else -> R.drawable.dino_coso
        }

        diceImage.setImageResource(diceImageDino)

        diceImage.contentDescription = diceRoll.toString()
    }

    class DiceDino(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()

        }
    }
// bottone random -< FINE
//--------------------------------------------------------------------------------------------------


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}