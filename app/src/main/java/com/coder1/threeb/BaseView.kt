package com.coder1.threeb

interface BaseView<T> {
    fun setPresenter(presenter: T)
}