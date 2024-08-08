package com.solo.newsapiclient.domain.repository

import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.model.Article
import com.solo.newsapiclient.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}