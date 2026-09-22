package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.R
import com.example.catalogoevaluacion.ItemData
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale


@Composable
fun CardItemGrid(
    item: ItemData,
    onClick: () ->  Unit
){


    Card(
        modifier = Modifier
            .width(140.dp)
            .height(190.dp)
            .clickable {
                onClick()
            },

        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize().padding(8.dp)
        ) {
            Text(
                text = item.titulo,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Image(
                painter = painterResource(
                    id = item.imagenRes
                ),

                contentDescription = null,
                modifier = Modifier.size(78.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = item.genero,
                style = MaterialTheme.typography.bodySmall
            )



        }
    }
}