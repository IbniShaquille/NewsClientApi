package com.solo.newsapiclient.presentation.di

import com.solo.newsapiclient.data.repository.NewsRepositoryImpl
import com.solo.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import com.solo.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}