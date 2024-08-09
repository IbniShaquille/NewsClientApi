package com.solo.newsapiclient.data.repository.dataSource

import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.utils.Resource
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}