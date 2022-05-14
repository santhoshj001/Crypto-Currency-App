package com.teamb.cryptocurrencyapp.presentation.coin_detail

import com.teamb.cryptocurrencyapp.domain.model.Coin
import com.teamb.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
