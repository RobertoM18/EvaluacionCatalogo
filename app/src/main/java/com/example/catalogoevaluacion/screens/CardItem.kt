package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.catalogoevaluacion.ItemData

@Composable
fun CardItemGrid(item: ItemData, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(item.titulo, style = MaterialTheme.typography.bodyMedium)
            Image(
                painter = painterResource(item.imagenRes),
                contentDescription = null,
                modifier = Modifier.size(78.dp),
                contentScale = ContentScale.Fit
            )
<<<<<<< HEAD

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = item.nombre,
                style = MaterialTheme.typography.bodySmall
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = item.autor,
                style = MaterialTheme.typography.bodySmall
            )
=======
            Text(item.nombre, style = MaterialTheme.typography.bodyMedium)
            Text(item.autor, style = MaterialTheme.typography.bodySmall)
>>>>>>> 38cdab7 (Segunda Version)
        }
    }
}
