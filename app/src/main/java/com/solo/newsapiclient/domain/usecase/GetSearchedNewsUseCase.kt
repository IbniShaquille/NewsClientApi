package com.solo.newsapiclient.domain.usecase

import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.utils.Resource
import com.solo.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}