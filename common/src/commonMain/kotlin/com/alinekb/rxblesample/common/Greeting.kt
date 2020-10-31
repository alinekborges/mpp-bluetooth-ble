package com.alinekb.rxblesample.common


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
