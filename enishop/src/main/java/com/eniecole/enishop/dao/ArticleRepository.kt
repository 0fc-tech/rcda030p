package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

object ArticleRepository {
    private val daoMemory = DaoFactory.getDao(DaoType.MEMORY)
    private val daoNetwork = DaoFactory.getDao(DaoType.NETWORK)

    fun getArticle(id : Long): Article? =
        daoMemory.selectById(id)

    fun addArticle(article: Article): Long =
        daoMemory.addNewOne(article)
    fun addAllArticle(vararg listArticle : Article ) =
        listArticle.map {
            addArticle(it)
        }


    fun getAllArticle() : List<Article> =
        daoMemory.getAll()

}