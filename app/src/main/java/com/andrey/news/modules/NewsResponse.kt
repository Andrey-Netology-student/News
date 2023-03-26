package com.andrey.news.modules

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)