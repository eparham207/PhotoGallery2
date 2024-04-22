package com.parham.msu.photogallery2.api

import retrofit2.http.GET

private const val API_KEY = "ba3a31dfae70e3d93346c5fcbda94dc0"
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
   fun fetchPhotos():FlickrResponse
}