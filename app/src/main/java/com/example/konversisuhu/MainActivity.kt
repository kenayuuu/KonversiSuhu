package com.example.konversisuhu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etCelsius: EditText
    private lateinit var btnKonversi: Button
    private lateinit var tvFahrenheit: TextView
    private lateinit var tvKelvin: TextView
    private lateinit var tvReamur: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi view
        etCelsius = findViewById(R.id.etCelsius)
        btnKonversi = findViewById(R.id.btnKonversi)
        tvFahrenheit = findViewById(R.id.tvFahrenheit)

        etCelsius = findViewById(R.id.etCelsius)
        btnKonversi = findViewById(R.id.btnKonversi)
        tvReamur = findViewById(R.id.tvReamur)

        etCelsius = findViewById(R.id.etCelsius)
        btnKonversi = findViewById(R.id.btnKonversi)
        tvKelvin = findViewById(R.id.tvKelvin)
        // ... dan seterusnya

        btnKonversi.setOnClickListener {
            val celsius = etCelsius.text.toString().toDoubleOrNull() ?: 0.0
            val fahrenheit = (celsius * 1.8) + 32
            val kelvin = celsius + 273.15
            val reamur = (0.8) * celsius

            tvFahrenheit.text = "Fahrenheit: $fahrenheit"
            tvKelvin.text = "Kelvin: $kelvin"
            tvReamur.text = "Reamur: $reamur"
        }
    }
}