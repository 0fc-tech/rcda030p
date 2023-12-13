package com.eniecole.enishop

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleRepository
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mbp2023 = Article(0L,
            "MBP 16pouces",
            "Ordinateu très cher",
            4000.0,
            "https",
            LocalDateTime.now()
        )
        val dell2023 = Article(0L,
            "Dell 16pouces",
            "Ordinateu moins cher",
            000.0,
            "https",
            LocalDateTime.now()
        )
        val switchCisco = Article(0L,
            "switchCisco",
            "Swtich d'une grosse marque",
            500.0,
            "https",
            LocalDateTime.now()
        )
        val listIds = ArticleRepository.addAllArticle(mbp2023,dell2023,switchCisco)
        Toast.makeText(this,
            "Ids des articles ajoutés $listIds",
            Toast.LENGTH_SHORT).show()
    }
}