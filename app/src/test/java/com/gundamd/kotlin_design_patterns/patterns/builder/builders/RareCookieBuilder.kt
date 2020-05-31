package com.gundamd.kotlin_design_patterns.patterns.builder.builders

import com.gundamd.kotlin_design_patterns.patterns.builder.products.Cookie

class RareCookieBuilder :
    ICookieBuilder {
    var name: String? = null
    var ability: String? = null
    var candy: String? = null
    private val candyAbility = "Every candy + 10 point"
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
        cookie.candy = candy
        if (this.candy != null)
            cookie.candyAbility = candyAbility
        return cookie
    }

}