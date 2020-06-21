package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products

interface ICommonCookie {
    fun genCookie(cookie: String)
    fun asembleCommonCookie()
}

class CommonCookie : ICommonCookie {
    var cookie: String? = null
    override fun genCookie(cookie: String) {
        this.cookie = cookie
    }

    override fun asembleCommonCookie() {
        if(cookie!=null){
            println(cookie)
        }
    }
}