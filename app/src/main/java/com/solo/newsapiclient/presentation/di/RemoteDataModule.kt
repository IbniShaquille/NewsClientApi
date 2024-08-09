package com.solo.newsapiclient.presentation.di

import com.solo.newsapiclient.data.api.NewsAPIService
import com.solo.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.solo.newsapiclient.data.repository.datasourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}