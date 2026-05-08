package com.example.app_club_deportivo

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class GestionDeSociosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_de_socios)

        // Configuración del botón volver
        val btnVolver = findViewById<LinearLayout>(R.id.btn_volver)
        btnVolver.setOnClickListener {
            finish()
        }
    }
}
