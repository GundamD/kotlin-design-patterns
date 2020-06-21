package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products

interface IRareCookie {
    fun genCookie(cookie: String)
    fun asembleRareCookie()
}

class RareCookie : IRareCookie {
    var cookie: String? = null
    override fun genCookie(cookie: String) {
        this.cookie = cookie
    }

    override fun asembleRareCookie() {
        if(cookie!=null){
            println(cookie)
        }
    }
}