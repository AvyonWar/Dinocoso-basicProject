package com.example.dinocoso_prefatta.data

import com.example.dinocoso_prefatta.R
import com.example.dinocoso_prefatta.model.ImageTextView

class Datasource {
    fun loadImageTextView(): List<ImageTextView>{
        return listOf<ImageTextView>(
            ImageTextView(R.drawable.dino, R.string.descrizione),
            ImageTextView(R.drawable.dino_coso_pop,R.string.descrizione_due)
        )
    }
}