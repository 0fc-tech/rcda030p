package com.example.mod4databinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mod4databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.user = User(
        //    "Jean-Michel",
        //    "Doe",
        //    "jeanmichel@doe.com"
        //)
        binding.user = null//User("Jean-Michel","Doe","jeanmichel@doe.com")
        binding.button.setOnClickListener {
            Toast.makeText(this,
                "${binding.user}",
                Toast.LENGTH_SHORT).show()
        }
    }
}