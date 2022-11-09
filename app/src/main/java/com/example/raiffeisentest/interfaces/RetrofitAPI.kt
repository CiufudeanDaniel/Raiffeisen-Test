package com.example.raiffeisentest.interfaces

import com.example.raiffeisentest.models.ResultModel
import retrofit2.http.*

interface RetrofitAPI {

    @GET("api/")
    suspend fun getUsers(
        @Query("page") page: Int,
        @Query("results") results: Int,
        @Query("seed") seed: String
        ): ResultModel
}