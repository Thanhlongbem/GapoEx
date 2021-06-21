package com.louis.gapoex.core.rest

object Constants {
    const val DEFAULT_SERVER = "https://raw.githubusercontent.com/Akaizz/static/master/"

    var API_BASE_PATH = DEFAULT_SERVER

    object API{
        const val PATH_GET_LIST = "/newsfeed.json"
        const val PATH_DETAIL = "/detail.json"

    }
}