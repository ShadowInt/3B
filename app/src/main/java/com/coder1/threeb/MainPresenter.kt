package com.coder1.threeb


class MainPresenter(view: MainContract.View) : MainContract.Presenter {
    private var view: MainContract.View? = view

    override fun onViewCreated() {
        val data = App.instance.sharedPreferencesManager.getData()
        view?.displayData(data ?: "None")
    }

    override fun onChangeData(s: String) {
        App.instance.sharedPreferencesManager.updateData(s)
        view?.displayData(s)
    }

    override fun onDestroy() {
        this.view = null
    }
}
