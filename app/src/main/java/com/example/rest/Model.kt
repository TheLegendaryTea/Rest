package com.example.rest
import com.google.gson.annotations.SerializedName

data class Place(
    @SerializedName("place name") val placeName: String,
    val longitude: String,
    val state: String,
    @SerializedName("state abbreviation") val stateAbbreviation: String,
    val latitude: String
)
data class Model (
    @SerializedName("post code") val postCode: String,
    val country: String,
    @SerializedName("country abbreviation") val countryAbbreviation: String,
    val places: List<Place>
)