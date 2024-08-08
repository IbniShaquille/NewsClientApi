package com.solo.newsapiclient.domain.usecase

import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.utils.Resource
import com.solo.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute() : Resource<APIResponse> {
        return newsRepository.getNewsHeadlines()
    }
}