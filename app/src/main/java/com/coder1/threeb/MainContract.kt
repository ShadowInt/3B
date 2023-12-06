package com.coder1.threeb

import com.coder1.base.BasePresenter
import com.coder1.base.BaseView

interface MainContract {
    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onChangeData(s: String)
    }

    interface View : BaseView<Presenter> {
        fun displayData(s: String)
    }
}
