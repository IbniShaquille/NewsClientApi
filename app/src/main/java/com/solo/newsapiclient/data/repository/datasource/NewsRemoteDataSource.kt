package com.solo.newsapiclient.data.repository.datasource

import com.solo.newsapiclient.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<APIResponse>
}