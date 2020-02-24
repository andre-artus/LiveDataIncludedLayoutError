package com.example.livedataincludedlayouterror.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _state = MutableLiveData<UiState<Boolean>>()
    val state: LiveData<UiState<Boolean>>
        get() = _state


    fun runTest() {
        viewModelScope.launch {
            _state.value = UiState.loading(null)
            delay(500)
            _state.value = UiState.success(true)
        }

    }
}
