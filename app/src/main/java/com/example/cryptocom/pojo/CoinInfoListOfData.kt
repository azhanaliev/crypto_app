package com.example.cryptocom.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class CoinInfoListOfData(
    @SerializedName("Data")
    @Expose
    var data: List<Datum>? = null
)