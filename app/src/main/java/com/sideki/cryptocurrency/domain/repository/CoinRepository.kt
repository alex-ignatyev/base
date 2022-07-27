package com.sideki.cryptocurrency.domain.repository

import com.sideki.cryptocurrency.data.remote.dto.CoinDetailDto
import com.sideki.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}