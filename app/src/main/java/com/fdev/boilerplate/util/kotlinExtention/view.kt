package com.fdev.boilerplate.util.kotlinExtention

import android.view.View


fun View.goVisible() {
    visibility = View.VISIBLE
}

fun View.goGone() {
    visibility = View.GONE
}

fun View.goInvisible() {
    visibility = View.INVISIBLE
}
