package com.fdev.boilerplate.util


import kotlinx.coroutines.TimeoutCancellationException


fun errorHandler(exception: Exception , specifErrorHandler : ((exception : Exception) -> UIInteraction? )? = null) : UIInteraction {
    specifErrorHandler?.let{
        it(exception)?.let{
            return it
        }
    }
    var userInteraction : UIInteraction = exception.message?.let{
        UIInteraction.ShowToast(toastMessage = it)
    }?: UIInteraction.ShowToast(toastMessage = "Error Tidak Diketahui")

    when(exception){
        is TimeoutCancellationException -> {
            userInteraction = UIInteraction.ShowToast(toastMessage = "Timeout  Error")
        }
    }
    return userInteraction
}
