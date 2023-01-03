package com.davidson.pagination3demo.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class SearchResult(
    @SerialName("results")
    val images: List<UnsplashImage>
)
