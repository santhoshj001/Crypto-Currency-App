package com.teamb.cryptocurrencyapp.common

sealed class Resource<T>(val data: T? = null, message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data = data)
    class Error<T>(message: String?, data: T?) : Resource<T>(data = data, message = message)
    class Loading<T>(data: T?) : Resource<T>(data = data)
}
