package com.eniecole.enishop.dao

import com.eniecole.enishop.dao.memory.ArticleDaoMemoryImpl
import com.eniecole.enishop.dao.network.ArticleDaoNetworkImpl

object DaoFactory {
    fun getDao(type: DaoType) : ArticleDao = when(type){
        DaoType.MEMORY -> ArticleDaoMemoryImpl()
        DaoType.NETWORK -> ArticleDaoNetworkImpl()
    }
}