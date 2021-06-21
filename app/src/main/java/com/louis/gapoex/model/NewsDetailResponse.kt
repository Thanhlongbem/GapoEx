package com.louis.gapoex.model


import com.google.gson.annotations.SerializedName

data class NewsDetailResponse(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("document_id")
    val documentId: String = "",
    @SerializedName("origin_url")
    val originUrl: String = "",
    @SerializedName("published_date")
    val publishedDate: String = "",
    @SerializedName("publisher")
    val publisher: PublisherNews = PublisherNews(),
    @SerializedName("sections")
    val sections: List<Section> = listOf(),
    @SerializedName("template_type")
    val templateType: String = "",
    @SerializedName("title")
    val title: String = ""
)

data class Content(
    @SerializedName("caption")
    val caption: String = "",
    @SerializedName("duration")
    val duration: Int = 0,
    @SerializedName("href")
    val href: String = "",
    @SerializedName("main_color")
    val mainColor: String = "",
    @SerializedName("markups")
    val markups: List<Markup> = listOf(),
    @SerializedName("original_height")
    val originalHeight: Int = 0,
    @SerializedName("original_width")
    val originalWidth: Int = 0,
    @SerializedName("preview_image")
    val previewImage: PreviewImage = PreviewImage(),
    @SerializedName("text")
    val text: String = ""
)

data class Markup(
    @SerializedName("end")
    val end: Int = 0,
    @SerializedName("href")
    val href: String = "",
    @SerializedName("markup_type")
    val markupType: Int = 0,
    @SerializedName("start")
    val start: Int = 0
)

data class PreviewImage(
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("href")
    val href: String = "",
    @SerializedName("main_color")
    val mainColor: String = "",
    @SerializedName("width")
    val width: Int = 0
)

data class PublisherNews(
    @SerializedName("icon")
    val icon: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)

data class Section(
    @SerializedName("content")
    val content: Content = Content(),
    @SerializedName("section_type")
    val sectionType: Int = 0
)