package com.eniecole.enishop.dao.memory

import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleDao

class ArticleDaoMemoryImpl : ArticleDao{
    private val arrayListArticles = arrayListOf<Article>()
    private var lastIndex = 0L;

    override fun selectById(id: Long): Article? =
        arrayListArticles.firstOrNull { it.id == id }

    override fun addNewOne(article: Article): Long {
        //On récupère le dernier id*
        val id = ++lastIndex
        //on ajoute
        arrayListArticles.add(article.copy(id = id))
        //on retourne l'id
        return id
    }

    override fun getAll(): List<Article> = arrayListArticles
}