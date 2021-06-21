package com.louis.gapoex

import com.louis.gapoex.core.repository.MainRepository
import com.louis.gapoex.core.rest.RestService
import com.louis.gapoex.core.service.MainService
import com.louis.gapoex.viewmodel.MainViewmodel

object Injection {

    fun provideMainViewModel(): MainViewmodel {
        val service = RestService.createService(MainService::class.java)
        val repository = MainRepository(service)
        return MainViewmodel(repository)
    }

    // provide another viewModel here
}