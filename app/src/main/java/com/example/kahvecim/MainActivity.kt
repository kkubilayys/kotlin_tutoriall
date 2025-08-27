package com.example.kahvecim

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kahvecim.databinding.ActivityMainBinding
import com.example.kahvecim.databinding.ImageLayoutBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var imageLayoutBinding: ImageLayoutBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        imageLayoutBinding = ImageLayoutBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnYazdR.setOnClickListener {
            val isim = binding.etSim.text.toString()
            val soyisim = binding.etSoyisim.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etTel.text.toString()
            val sifre = binding.etSifre.text.toString()

            binding.veriler.text = isim + "\n" +
                    soyisim + "\n" +
                    email + "\n" +
                    phone + "\n" +
                    sifre

        }
    }
}


