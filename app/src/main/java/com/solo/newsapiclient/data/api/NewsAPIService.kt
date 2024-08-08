package com.solo.newsapiclient.data.api

import com.solo.newsapiclient.BuildConfig
import com.solo.newsapiclient.data.model.APIResponse
import com.solo.newsapiclient.data.utils.Resource
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = BuildConfig.API_KEY
    ): Resource<APIResponse>


}