package com.example.catalogoevaluacion.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.example.catalogoevaluacion.Pantalla
import com.example.catalogoevaluacion.catalogoItems

@Composable
fun AppMainScreen() {
    // Estas dos variables se conservan al girar el teléfono.
    var pantallaActual by rememberSaveable {
        mutableStateOf(Pantalla.INICIO)
    }
    var posicionSeleccionada by rememberSaveable {
        mutableStateOf(0)
    }

    // Elegimos el título según la pantalla.
    var titulo = "Catálogo General"
    if (pantallaActual == Pantalla.GRID) {
        titulo = "Explora Colecciones"
    }
    if (pantallaActual == Pantalla.DETALLE) {
        titulo = "Detalle"
    }

    // También permite volver con el botón del teléfono.
    BackHandler(enabled = pantallaActual != Pantalla.INICIO) {
        if (pantallaActual == Pantalla.DETALLE) {
            pantallaActual = Pantalla.GRID
        } else {
            pantallaActual = Pantalla.INICIO
        }
    }

    // Primero mostramos la barra y debajo la pantalla elegida.
    Column(
        modifier = Modifier.fillMaxSize().safeDrawingPadding()
    ) {
        AppNavbar(
            titulo = titulo,
            mostrarVolver = pantallaActual != Pantalla.INICIO,
            onVolver = {
                if (pantallaActual == Pantalla.DETALLE) {
                    pantallaActual = Pantalla.GRID
                } else {
                    pantallaActual = Pantalla.INICIO
                }
            }
        )

        when (pantallaActual) {
            Pantalla.INICIO -> PantallaInicio(
                onNavegarGrid = {
                    pantallaActual = Pantalla.GRID
                }
            )

            Pantalla.GRID -> PantallaGrid(
                onItemClick = { posicion ->
                    posicionSeleccionada = posicion
                    pantallaActual = Pantalla.DETALLE
                }
            )

            Pantalla.DETALLE -> PantallaDetalle(
                item = catalogoItems[posicionSeleccionada]
            )
        }
    }
}
