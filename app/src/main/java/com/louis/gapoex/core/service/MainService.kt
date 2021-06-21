package com.louis.gapoex.core.service

import com.louis.gapoex.core.rest.Constants
import com.louis.gapoex.model.GetListResponse
import com.louis.gapoex.model.NewsDetailResponse
import io.reactivex.Single
import retrofit2.http.GET

interface MainService {
    @GET(Constants.API.PATH_GET_LIST)
    fun getListNew() : Single<GetListResponse>

    @GET(Constants.API.PATH_DETAIL)
    fun getNewsDetail() : Single<NewsDetailResponse>
}