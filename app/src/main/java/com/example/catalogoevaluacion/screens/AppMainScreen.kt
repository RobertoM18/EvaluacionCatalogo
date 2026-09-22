package com.example.catalogoevaluacion.screens
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.catalogoevaluacion.ItemData
import com.example.catalogoevaluacion.Pantalla

@Composable
fun AppMainScreen() {

    var pantallaActual by remember {
        mutableStateOf(Pantalla.INICIO)
    }

    var itemSeleccionado by remember {
        mutableStateOf<ItemData?>(null)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        when (pantallaActual) {

            Pantalla.INICIO -> PantallaInicio(
                onNavegarGrid = {
                    pantallaActual = Pantalla.GRID
                }
            )

            Pantalla.GRID -> PantallaGrid(
                onItemClick = { item ->
                    itemSeleccionado = item
                    pantallaActual = Pantalla.DETALLE
                },
                onVolver = {
                    pantallaActual = Pantalla.INICIO
                }
            )

            Pantalla.DETALLE -> PantallaDetalle(
                item = itemSeleccionado,
                onVolver = {
                    pantallaActual = Pantalla.GRID
                }
            )
        }
    }
}