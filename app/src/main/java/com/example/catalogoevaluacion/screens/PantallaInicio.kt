package com.example.catalogoevaluacion.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.catalogoevaluacion.R

@Composable
fun PantallaInicio(
    onNavegarGrid: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Image(
            painter = painterResource(
                id = R.drawable.libroicono
            ),

            contentDescription = "Logo",

            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Text(
            text = "Bienvenido al Catálogo General",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Text(
            text = "Explora y descubre detalles sobre multiples categorias. Tu guia movil interactiva"
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Button(
            onClick = onNavegarGrid,

            modifier = Modifier.fillMaxWidth(0.6f),



        ) {

            Text ("Ver Catalogo")


        }

    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicioPreview() {
    PantallaInicio(
        onNavegarGrid = {}
    )
}