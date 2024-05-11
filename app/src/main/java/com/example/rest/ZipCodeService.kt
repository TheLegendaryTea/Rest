package com.example.rest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ZipCodeService {
    @GET("{country}/{zipcode}")
    fun getZipInfo(@Path("country") country: String, @Path("zipcode") zipcode: String): Call<Model>
}