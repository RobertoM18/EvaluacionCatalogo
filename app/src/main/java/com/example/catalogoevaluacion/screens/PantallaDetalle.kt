package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogoevaluacion.ItemData
import com.example.catalogoevaluacion.catalogoItems

@Composable
fun PantallaDetalle(item: ItemData) {
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState()).padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(item.imagenRes),
            contentDescription = item.nombre,
            modifier = Modifier.size(140.dp)
        )
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
<<<<<<< HEAD

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Text(
                    text =
                        item?.nombre
                            ?: "Información de la Card",

                    style =
                        MaterialTheme.typography.headlineMedium
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )


                Text(
                    text =
                        item?.autor
                            ?: "Detalles del elemento seleccionado...",

                    style =
                        MaterialTheme.typography.bodySmall
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text =
                        item?.description
                            ?: "Detalles del elemento seleccionado...",

                    style =
                        MaterialTheme.typography.bodyMedium
                )
=======
                Text(item.titulo, style = MaterialTheme.typography.titleMedium)
                Text(item.nombre, style = MaterialTheme.typography.headlineMedium)
                Text("Autor: ${item.autor}")
                Text("Publicado: ${item.publicado}")
                Text("Género: ${item.genero}")
                Text(item.description, style = MaterialTheme.typography.bodyMedium)
>>>>>>> 38cdab7 (Segunda Version)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaDetallePreview() {
    PantallaDetalle(item = catalogoItems[0])
}
