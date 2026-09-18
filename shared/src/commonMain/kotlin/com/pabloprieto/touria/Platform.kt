package com.pabloprieto.touria

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform