package com.sideki.cryptocurrency.presentation.coin_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sideki.cryptocurrency.common.Constants.COIN_ID_KEY
import com.sideki.cryptocurrency.common.Resource
import com.sideki.cryptocurrency.domain.use_case.GetCoinUseCase
import com.sideki.cryptocurrency.domain.use_case.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(CoinDetailState())
    val state: State<CoinDetailState> = _state

    init {
        savedStateHandle.get<String>(COIN_ID_KEY)?.let { coinId ->
            getCoin(coinId)
        }
    }

    private fun getCoin(coinId: String) {
        getCoinUseCase(coinId).onEach { result ->
            when (result) {
                is Resource.Success -> _state.value = CoinDetailState(coin = result.data)
                is Resource.Error -> _state.value = CoinDetailState(error = result.message)
                is Resource.Loading -> _state.value = CoinDetailState(isLoading = true)
            }
        }.launchIn(viewModelScope)
    }
}