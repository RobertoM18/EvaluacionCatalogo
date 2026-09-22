package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogoevaluacion.R
import com.example.catalogoevaluacion.ItemData

@Composable
fun PantallaGrid(
    onItemClick: (ItemData) -> Unit,
    onVolver: () -> Unit
){
        val listaItems = remember {

            listOf(
                ItemData(
                    id = 1,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable.libroicono
                    ),

                ItemData(
                    id = 2,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable.images
                ),
                ItemData(
                    id = 3,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable.pngtree_vector_car_icon_png_image_4277458
                ),
                ItemData(
                    id = 4,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable.libroicono
                ),
                ItemData(
                    id = 5,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable._80942
                ),
                ItemData(
                    id = 6,
                    titulo = "Libros",
                    nombre = "Sapiens: De Animales a Dioses",
                    autor = "Yuval Noah Harari",
                    publicado = 2011,
                    genero = "Historia",
                    description = "Una frase realista describe su discplina controvercial",
                    imagenRes = R.drawable.pngtree_vector_car_icon_png_image_4277458
                ),
            )
        }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),

            verticalAlignment =Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.libroicono
                ),
                contentDescription = "logo",

                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Text(
                text = "Explora Colecciones",
                style = MaterialTheme.typography.titleLarge
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(
                    8.dp,
                    Alignment.CenterHorizontally
                )
            ) {
                CardItemGrid(
                    item = listaItems[0],
                    onClick = {
                        onItemClick(listaItems[0])
                    }
                )

                CardItemGrid(
                    item = listaItems[1],
                    onClick = {
                        onItemClick(listaItems[1])
                    }
                )
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(
                    8.dp,
                    Alignment.CenterHorizontally
                )
            ) {
                CardItemGrid(
                    item = listaItems[2],
                    onClick = {
                        onItemClick(listaItems[2])
                    }
                )

                CardItemGrid(
                    item = listaItems[3],
                    onClick = {
                        onItemClick(listaItems[3])
                    }
                )
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(
                    8.dp,
                    Alignment.CenterHorizontally
                )
            ) {
                CardItemGrid(
                    item = listaItems[4],
                    onClick = {
                        onItemClick(listaItems[4])
                    }
                )

                CardItemGrid(
                    item = listaItems[5],
                    onClick = {
                        onItemClick(listaItems[5])
                    }
                )
            }

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            Button(
                onClick = onVolver,
                modifier = Modifier.align(Alignment.Start)
            ){
                Text("Atras")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PantallaGridPreview() {
    PantallaGrid(
        onItemClick = {},
        onVolver = {}
    )
}