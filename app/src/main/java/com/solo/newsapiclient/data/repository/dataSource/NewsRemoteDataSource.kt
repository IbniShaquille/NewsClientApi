package com.solo.newsapiclient.data.repository.dataSource

import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.utils.Resource

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(): Resource<APIResponse>
}