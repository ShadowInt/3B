package com.coder1.threeb

interface MainContract {
    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onChangeData(s: String)
    }

    interface View : BaseView<Presenter> {
        fun displayData(s: String)
    }
}
