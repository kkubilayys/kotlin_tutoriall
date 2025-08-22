package com.example.kahvecim

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

binding.butonum.setOnClickListener {

    binding.imageButton.setImageResource(R.drawable.gs)

}

//           var sayi = 0
//
//      binding.benimbutonum.setOnClickListener {
//
//        if (sayi < 10)
//
//         sayi++
//            binding.benimtextim.text = sayi.toString()
//        }



    }


}