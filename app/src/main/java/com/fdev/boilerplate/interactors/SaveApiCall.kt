package com.fdev.boilerplate.interactors

import com.fdev.boilerplate.util.UIInteraction
import com.fdev.boilerplate.util.errorHandler
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

fun <T> saveCall(
    tobeExecute: suspend () -> T,
    dispatcher: CoroutineDispatcher,
    onSuccessInteraction: UIInteraction = UIInteraction.DoNothing,
    specificErrorHandler: ((exception: Exception) -> UIInteraction?)?
) : Flow<Resource<T>> = flow{
    try{
        emit(Resource.Loading<T>())
        emit(Resource.Success(data = tobeExecute() , onSuccessInteraction = onSuccessInteraction))
    }catch(exception : Exception){
        emit(Resource.Error<T>(onErrorInteraction = errorHandler(exception = exception , specifErrorHandler = specificErrorHandler)))

    }
}.flowOn(dispatcher)