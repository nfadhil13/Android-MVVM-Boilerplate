package com.fdev.boilerplate.presentation

import com.fdev.boilerplate.util.UIInteraction


abstract class ActivityBaseViewModel(

): BaseViewModel() {


    fun showUserInteraction(userInteraction: UIInteraction) {
        setUserInteraction(userInteraction)
    }


    fun startLoading() {
        setLoading(true)
    }

    fun finishLoading() {
        setLoading(false)
    }

}