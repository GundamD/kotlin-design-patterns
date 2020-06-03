package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.builders

import com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.builder.products.Cookie

class CommonCookieBuilder :
    ICookieBuilder {
    var name: String? = null
    var ability: String? = null
    var candy: String? = null
    override fun setName(name: String): ICookieBuilder {
        this.name = name
        return this
    }

    override fun setAbility(ability: String?): ICookieBuilder {
        this.ability = ability
        return this
    }

    override fun setCandy(candy: String?): ICookieBuilder {
        this.candy = candy
        return this
    }

    override fun createCookie(): Cookie {
        val cookie = Cookie()
        cookie.name = name
        cookie.cookieAbility = ability
        cookie.candy = null
        cookie.cookieAbility = null
        return cookie
    }

}