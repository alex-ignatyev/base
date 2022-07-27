package com.sideki.cryptocurrency.domain.use_case

import com.sideki.cryptocurrency.common.Resource
import com.sideki.cryptocurrency.data.remote.dto.toCoin
import com.sideki.cryptocurrency.domain.model.Coin
import com.sideki.cryptocurrency.domain.repository.CoinRepository
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
            emit(Resource.Error(e.localizedMessage ?: "Unknown Http error"))
        } catch (e: IOException) {
            emit(Resource.Error("Some global error"))
        }
    }
}