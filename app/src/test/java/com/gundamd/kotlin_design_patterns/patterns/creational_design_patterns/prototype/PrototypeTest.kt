package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.prototype

import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.prototype.products.CommonCookie
import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.prototype.products.Cookie
import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.prototype.products.RareCookie
import org.junit.jupiter.api.Test
import java.lang.ClassCastException

class PrototypeTest {

    @Test
    fun testPrototype() {
        val cookieList = ArrayList<Cookie>()
        val cloneCookieList = ArrayList<Cookie>()
        val commonCookie1 = CommonCookie()
        commonCookie1.name = "Strawberry Cookie1"
        commonCookie1.ability = "+1~5 seconds Bonus Time"
        cookieList.add(commonCookie1)
        val commonCookie2 = commonCookie1.clone()
        commonCookie2.name = "Strawberry Cookie2"
        cookieList.add(commonCookie2)

        val rareCookie1 = RareCookie()
        rareCookie1.name = "Ninja Cookie1"
        rareCookie1.ability = "10-step jump"
        rareCookie1.candy = "Shuriken"
        cookieList.add(rareCookie1)
        val rareCookie2 = rareCookie1.clone()
        rareCookie2.name = "Ninja Cookie2"
        cookieList.add(rareCookie2)


        println("Cookie")
        for (cookie in cookieList) {
            println("name: " + cookie.name)
            println("ability: " + cookie.ability)
            try {
                cookie as RareCookie
                println("candy: " + cookie.candy)
            } catch (ignore: ClassCastException) {
            }
            cloneCookieList.add(cookie.clone())
        }
        println("===============================")
        println("Clone Cookie")
        for (cookie in cloneCookieList) {
            println("name: " + cookie.name)
            println("ability: " + cookie.ability)
            try {
                cookie as RareCookie
                println("candy: " + cookie.candy)
            } catch (ignore: ClassCastException) {
            }
        }
    }
}