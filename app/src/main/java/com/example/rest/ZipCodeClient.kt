package com.example.rest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ZipCodeClient {
    private const val BASE_URL = "https://api.zippopotam.us/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: ZipCodeService = retrofit.create(ZipCodeService::class.java)
}