package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder

import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.builders.CommonCookieBuilder
import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.builders.CookieDirector
import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.builders.RareCookieBuilder
import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.products.Cookie
import org.junit.jupiter.api.Test

class BuilderTest {

    @Test
    fun builderTest() {
        val cookleDirector =
            CookieDirector()
        val commonCookieBuilder =
            CommonCookieBuilder()
        val braveCookie = cookleDirector.createBraveCookie(commonCookieBuilder)
        renderCookie(braveCookie)
        val rareCookieBuilder1 = RareCookieBuilder()
        val ninjaCookie = cookleDirector.createNinjaCookie(rareCookieBuilder1)
        renderCookie(ninjaCookie)
        val rareCookieBuilder2 = RareCookieBuilder()
        val zombieCookie = cookleDirector.createZombieCookie(rareCookieBuilder2)
        renderCookie(zombieCookie)
    }
    private fun renderCookie(cookie:Cookie){
        println("name:\t"+cookie.name)
        println("cookieAbility:\t"+cookie.cookieAbility)
        println("candy:\t"+cookie.candy)
        println("candyAbility:\t"+cookie.candyAbility)
    }
}