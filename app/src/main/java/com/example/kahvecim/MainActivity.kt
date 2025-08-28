package com.example.kahvecim

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        val markalar = resources.getStringArray(R.array.Markalar)

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,markalar)
        binding.acTextView.setAdapter(adapter)
        }


    }



