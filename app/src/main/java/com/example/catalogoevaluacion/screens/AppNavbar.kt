package com.example.catalogoevaluacion.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

zz
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavbar(titulo: String, mostrarVolver: Boolean, onVolver: () -> Unit) {
    TopAppBar(
        title = { Text(titulo) },
        navigationIcon = {
            if (mostrarVolver) {
                TextButton(onClick = onVolver) { Text("Atrás") }
            }
        }
    )
}
