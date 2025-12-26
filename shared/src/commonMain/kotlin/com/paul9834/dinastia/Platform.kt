package com.paul9834.dinastia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform