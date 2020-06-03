package com.gundamd.kotlin_design_patterns.patterns.singleton

import com.gundamd.kotlin_design_patterns.patterns.singleton.products.Cookie
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun testSingleton1() {
        Cookie.instance.name = "Ninja Cookie"
        println("cookie name: " +   Cookie.instance.name)
    }

    @Test
    fun testSingleton2() {
        println("cookie name: " +  Cookie.instance.name)
    }
}