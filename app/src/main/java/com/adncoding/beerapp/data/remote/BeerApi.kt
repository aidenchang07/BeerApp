package com.adncoding.beerapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by AidenChang 2024/02/27
 */
interface BeerApi {

    @GET("beers")
    suspend fun getBeers(
        @Query("page") page: Int,
        @Query("per_page") pageCount: Int
    ): List<BeerDto>

    companion object {
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}