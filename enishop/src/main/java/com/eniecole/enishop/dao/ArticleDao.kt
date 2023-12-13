package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

interface ArticleDao {
    fun selectById(id : Long) : Article?
    fun addNewOne(article: Article) :Long
    fun getAll() : List<Article>
}