package com.solo.newsapiclient.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.solo.newsapiclient.domain.usecase.GetNewsHeadlinesUseCase

class NewsViewModelFactory(
    private val application: Application,
    private val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(application, getNewsHeadlinesUseCase) as T
    }
}