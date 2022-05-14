package com.teamb.cryptocurrencyapp.domain.use_case.get_coin

import com.teamb.cryptocurrencyapp.common.Resource
import com.teamb.cryptocurrencyapp.data.remote.dto.toCoin
import com.teamb.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.teamb.cryptocurrencyapp.domain.model.Coin
import com.teamb.cryptocurrencyapp.domain.model.CoinDetail
import com.teamb.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage))
        }
    }
}