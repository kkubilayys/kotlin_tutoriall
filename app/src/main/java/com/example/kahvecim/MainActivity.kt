package com.example.kahvecim

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged
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

        binding.textInputEditText.doOnTextChanged { text, start, before, count ->

            if( text?.length!! > 10){
                binding.textInputLayout.error = "karakter sınırını aştınız"
            }
            else{
                binding.textInputLayout.error = null
            }
        }


    }
}


