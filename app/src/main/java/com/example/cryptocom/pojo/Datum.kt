package com.example.cryptocom.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class Datum (
    @SerializedName("CoinInfo")
    @Expose
    var coinInfo: CoinInfo? = null
)