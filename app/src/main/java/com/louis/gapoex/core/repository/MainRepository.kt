package com.louis.gapoex.core.repository

import com.louis.gapoex.core.service.MainService
import com.louis.gapoex.model.ListNewsResponse
import com.louis.gapoex.model.NewsDetailResponse
import io.reactivex.Single

class MainRepository(private val mainService: MainService) {
    fun getListNews() : Single<ListNewsResponse> {
        return mainService.getListNew()
    }

    fun getNewsDetail() : Single<NewsDetailResponse> {
        return mainService.getNewsDetail()
    }
}