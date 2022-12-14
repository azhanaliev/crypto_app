package com.example.cryptocom.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CoinPriceInfoRawData(
    @SerializedName("RAW")
    @Expose
    var coinPriceInfoJsonObject: JsonObject? = null
)