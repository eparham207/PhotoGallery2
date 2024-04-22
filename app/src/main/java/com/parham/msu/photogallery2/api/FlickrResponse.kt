package com.parham.msu.photogallery2.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlickrResponse (
    val photos: PhotoResponse
)