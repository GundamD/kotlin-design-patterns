package com.gundamd.kotlin_design_patterns.patterns.builder.builders

import com.gundamd.kotlin_design_patterns.patterns.builder.products.Cookie

class CookieDirector {

    fun createBraveCookie(builder: ICookieBuilder): Cookie {
        return builder.setName("Brave Cookie")
            .createCookie()
    }

    fun createNinjaCookie(builder: ICookieBuilder): Cookie {
        return builder.setName("Ninja Cookie")
            .setAbility("3~10-step jump")
            .setCandy("Ninja Candy")
            .createCookie()
    }

    fun createZombieCookie(builder: ICookieBuilder): Cookie {
        return builder.setName("Zombie Cookie")
            .setAbility("Revives you 1~8 times")
            .createCookie()
    }

}