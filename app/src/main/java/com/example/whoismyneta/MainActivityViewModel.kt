package com.example.whoismyneta

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(false)
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000L)
            _uiState.value = true
        }
    }
}