package com.teamb.cryptocurrencyapp.data.repository

import com.teamb.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.teamb.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.teamb.cryptocurrencyapp.data.remote.dto.CoinDto
import com.teamb.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
      return  api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
       return api.getCoinById(coinId)
    }
}