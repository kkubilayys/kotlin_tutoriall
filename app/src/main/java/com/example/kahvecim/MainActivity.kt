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



        fun topla(){

            val sayi1 = binding.etSayi1.text.toString().toInt()
            val sayi2 = binding.etSayi2.text.toString().toInt()
            val sonuc = sayi1 + sayi2
            binding.sonuc.text = sonuc.toString()
        }

        fun cıkar(){

            val sayi1 = binding.etSayi1.text.toString().toInt()
            val sayi2 = binding.etSayi2.text.toString().toInt()
            val sonuc = sayi1 - sayi2
            binding.sonuc.text = sonuc.toString()
        }
        fun capma(){

            val sayi1 = binding.etSayi1.text.toString().toInt()
            val sayi2 = binding.etSayi2.text.toString().toInt()
            val sonuc = sayi1 * sayi2
            binding.sonuc.text = sonuc.toString()
        }
        fun bolme(){

            val sayi1 = binding.etSayi1.text.toString().toInt()
            val sayi2 = binding.etSayi2.text.toString().toInt()
            if ( sayi2 != 0 ){
            val sonuc = sayi1 / sayi2
                binding.sonuc.text = sonuc.toString()
            }

        }
        binding.btntopla.setOnClickListener {
            topla()
        }
        binding.btncKar.setOnClickListener {
            cıkar()
        }
        binding.btncarp.setOnClickListener {
            capma()
        }
        binding.btnbol.setOnClickListener {
            bolme()
        }
    }
}


