package com.louis.gapoex.viewmodel

import androidx.lifecycle.MutableLiveData
import com.louis.gapoex.base.BaseViewModel
import com.louis.gapoex.core.repository.MainRepository
import com.louis.gapoex.core.rest.ResponseData
import com.louis.gapoex.extension.applyOn
import com.louis.gapoex.extension.disposedBy
import com.louis.gapoex.model.ListNewsResponse
import com.louis.gapoex.model.NewsDetailResponse

class MainViewmodel(private val mainRepository: MainRepository) : BaseViewModel() {

    val listNewsLiveData = MutableLiveData<ResponseData<ListNewsResponse>>()
    val newsDetailLiveData = MutableLiveData<ResponseData<NewsDetailResponse>>()

    fun getListNews(){
        listNewsLiveData.postValue(ResponseData.loading(null))
        mainRepository.getListNews()
            .applyOn()
            .subscribe(
                {
                    listNewsLiveData.postValue(ResponseData.success(it))
                }, {
                    listNewsLiveData.postValue(ResponseData.error("Something when wrong"))
                }
            ).disposedBy(compositeDisposable)
    }

    fun getNewsDetail() {
        newsDetailLiveData.postValue(ResponseData.loading(null))
        mainRepository.getNewsDetail()
            .applyOn()
            .subscribe(
                {
                    newsDetailLiveData.postValue(ResponseData.success(it))
                },{
                    newsDetailLiveData.postValue(ResponseData.error("Something when wrong"))
                }
            ).disposedBy(compositeDisposable)
    }
}