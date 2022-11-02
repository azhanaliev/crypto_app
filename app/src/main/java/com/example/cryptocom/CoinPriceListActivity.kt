package com.example.cryptocom

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        viewModel = ViewModelProviders.of(this)[CoinViewModel::class.java]
//        viewModel.priceList.observe(this, Observer {
//            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
//        })
        viewModel.getDetailInfo("BTC").observe(this) {
            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
        }

    }


}