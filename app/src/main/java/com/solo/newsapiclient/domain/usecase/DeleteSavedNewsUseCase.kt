package com.solo.newsapiclient.domain.usecase

import com.solo.newsapiclient.data.model.Article
import com.solo.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}