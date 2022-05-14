package com.teamb.cryptocurrencyapp.di

import com.teamb.cryptocurrencyapp.common.Constants
import com.teamb.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.teamb.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.teamb.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SinceKotlin::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCoinPaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepositoryApi(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}