package com.fdev.boilerplate.util

class SingleEvent<T>(private val value: T) {

    private var isConsumed = false


    fun get(): T? =
            if (isConsumed) {
                null
            } else {
                isConsumed = true
                value
            }


    fun peek() : T = value
}