package com.teamb.cryptocurrencyapp.domain.use_case.get_coins

import com.teamb.cryptocurrencyapp.common.Resource
import com.teamb.cryptocurrencyapp.data.remote.dto.toCoin
import com.teamb.cryptocurrencyapp.domain.model.Coin
import com.teamb.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage))
        }
    }
}