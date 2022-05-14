package com.teamb.cryptocurrencyapp.domain.repository

import com.teamb.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.teamb.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}