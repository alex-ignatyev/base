package com.sideki.cryptocurrency.domain.use_case

import com.sideki.cryptocurrency.common.Resource
import com.sideki.cryptocurrency.data.remote.dto.toCoinDetail
import com.sideki.cryptocurrency.domain.model.CoinDetail
import com.sideki.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "Unknown Http error"))
        } catch (e: IOException) {
            emit(Resource.Error("Some global error"))
        }
    }
}