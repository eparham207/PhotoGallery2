package com.parham.msu.photogallery2.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoResponse (
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)