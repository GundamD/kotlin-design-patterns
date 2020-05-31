package com.gundamd.kotlin_design_patterns.patterns.builder.builders

import com.gundamd.kotlin_design_patterns.patterns.builder.products.Cookie

interface ICookieBuilder {
    fun setName(name: String): ICookieBuilder
    fun setAbility(ability: String?): ICookieBuilder
    fun setCandy(candy: String?): ICookieBuilder
    fun createCookie(): Cookie
}