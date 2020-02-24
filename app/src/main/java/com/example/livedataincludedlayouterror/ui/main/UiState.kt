package com.example.livedataincludedlayouterror.ui.main

@Suppress("DataClassPrivateConstructor")
data class UiState<T> private constructor(
    val status: Status,
    val data: T?,
    val message: String? = null
) {
    companion object {
        fun <T> success(data: T?) = UiState(Status.SUCCESS, data)
        fun <T> loading(data: T?): UiState<T> = UiState(Status.LOADING, data)
        fun <T> error(msg: String, data: T?): UiState<T> = UiState(Status.ERROR, data, message = msg)
    }
}