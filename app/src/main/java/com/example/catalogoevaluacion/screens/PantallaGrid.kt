package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogoevaluacion.catalogoItems

@Composable
fun PantallaGrid(onItemClick: (Int) -> Unit) {

<<<<<<< HEAD
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
=======
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
>>>>>>> 38cdab7 (Segunda Version)
    ) {

        items(catalogoItems.size) { posicion ->
            CardItemGrid(
                item = catalogoItems[posicion],
                onClick = { onItemClick(posicion) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaGridPreview() {
    PantallaGrid(onItemClick = {})
}
