package com.solo.newsapiclient.data.repository.dataSourceImpl

import com.solo.newsapiclient.data.api.NewsAPIService
import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.solo.newsapiclient.data.utils.Resource

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page: Int,
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Resource<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}