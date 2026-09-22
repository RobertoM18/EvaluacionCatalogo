package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogoevaluacion.ItemData
import com.example.catalogoevaluacion.R


@Composable
fun PantallaDetalle(
    item: ItemData?,
    onVolver: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        horizontalAlignment =
            Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.libroicono
            ),

            contentDescription = "Logo",

            modifier = Modifier
                .size(80.dp)
                .padding(bottom = 16.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(vertical = 16.dp),

            elevation =
                CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),

                horizontalAlignment =
                    Alignment.CenterHorizontally,

                verticalArrangement =
                    Arrangement.Center
            ) {

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
                        MaterialTheme.typography.bodyMedium
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
            }
        }

        Button(
            onClick = onVolver,

            modifier = Modifier.align(
                Alignment.Start
            )
        ) {

            Text("Atrás")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaDetallePreview() {
    PantallaDetalle(
        item = ItemData(
            id = 2,
            titulo = "Libros",
            nombre = "Sapiens: De Animales a Dioses",
            autor = "Yuval Noah Harari",
            publicado = 2011,
            genero = "Historia",
            description = "Una frase realista describe su discplina controvercial",
            imagenRes = R.drawable.libroicono
        ),
        onVolver = {}
    )
}