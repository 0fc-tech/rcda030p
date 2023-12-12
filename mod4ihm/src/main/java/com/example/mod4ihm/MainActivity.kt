package com.example.mod4ihm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mod4ihm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewHelloWorld.apply {
            text = "Hello World 😊😊"
            textSize = 25.0f
            setTextColor(0xFF52FF52.toInt())
        }
        /*findViewById<Button>(R.id.button)*/
        binding.button.setOnClickListener {
            Toast.makeText(this,
                "Bravo vous savez comment utiliser un bouton",
                Toast.LENGTH_SHORT).show()
        }
        binding.userName = "Jean-Michel"
    }
}



