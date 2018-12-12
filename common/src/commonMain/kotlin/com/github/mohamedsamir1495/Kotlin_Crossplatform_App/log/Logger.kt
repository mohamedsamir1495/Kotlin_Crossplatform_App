package com.github.mohamedsamir1495.Kotlin_Crossplatform_App.log

interface PlatformLogger {

    fun logException(tag: String, text: String, exception: Throwable?) {

    }

    fun log(tag: String, text: String) {

    }
}