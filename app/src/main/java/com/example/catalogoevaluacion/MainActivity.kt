package com.example.catalogoevaluacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.catalogoevaluacion.screens.AppMainScreen
import com.example.catalogoevaluacion.ui.theme.CatalogoEvaluacionTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CatalogoEvaluacionTheme {
                AppMainScreen()
            }
        }
    }
}
