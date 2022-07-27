package com.sideki.cryptocurrency.common

sealed class Resource<T>(val data: T? = null, message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(val message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
