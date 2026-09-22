package com.example.catalogoevaluacion


data class ItemData(
    val id: Int,
    val titulo: String,
    val nombre: String,
    val autor: String,
    val publicado: Int,
    val genero: String,
    val description: String,
    val imagenRes: Int
)