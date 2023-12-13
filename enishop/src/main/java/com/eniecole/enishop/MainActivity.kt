package com.eniecole.enishop

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleRepository
import com.eniecole.enishop.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mbp2023 = Article(0L,
            "MBP 16pouces",
            "Ordinateu très cher",
            4000.0,
            "https",
            LocalDateTime.now()
        )
        ArticleRepository.addArticle(mbp2023)
        binding.article = mbp2023
        binding.buttonSauvegarder.setOnClickListener {
            Toast.makeText(this,
                "${binding.article?.titre} " +
                        "${binding.article?.description} ${binding.editTextPrix.text.toString()}",
                Toast.LENGTH_SHORT).show()
        }
    }
}
