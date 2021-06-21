package com.louis.gapoex.model

import com.google.gson.annotations.SerializedName

data class ListNewsResponse(
    @SerializedName("items")
    val items: List<ItemDetail> = listOf()
)


data class ItemDetail(
    @SerializedName("avatar")
    val avatar: Any,
    @SerializedName("content")
    val content: Any,
    @SerializedName("content_type")
    val content_type: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("document_id")
    val document_id: String = "",
    @SerializedName("images")
    val images: Any,
    @SerializedName("origin_url")
    val origin_url: String = "",
    @SerializedName("published_date")
    val published_date: String = "",
    @SerializedName("publisher")
    val publisher: Publisher = Publisher(),
    @SerializedName("title")
    val title: String = ""
)

data class Publisher(
    @SerializedName("icon")
    val icon: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)