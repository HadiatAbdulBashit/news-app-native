package com.hab.newsapp.data.repository

import androidx.paging.PagingData
import com.hab.newsapp.data.ResultState
import com.hab.newsapp.data.model.ArticlesItem
import com.hab.newsapp.data.model.ArticlesItemEverything
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    fun getHeadline(country: String, category: String?): Flow<ResultState<List<ArticlesItem>>>
    fun getEverythingPaging(pageNumber: Int, query: String): Flow<PagingData<ArticlesItemEverything>>
}