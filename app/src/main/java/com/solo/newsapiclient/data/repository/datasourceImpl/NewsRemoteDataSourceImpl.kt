package com.solo.newsapiclient.data.repository.datasourceImpl

import com.solo.newsapiclient.data.api.NewsAPIService
import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}