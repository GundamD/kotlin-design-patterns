package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products

class RareToCommonCookie:ICommonCookie{
    private var rareCookie:RareCookie? =null

    constructor(rareCookie: RareCookie?) {
        this.rareCookie = rareCookie
    }


    override fun asembleCommonCookie() {
        rareCookie?.asembleRareCookie()
    }

    override fun genCookie(cookie: String) {
        rareCookie?.genCookie(cookie)
    }


}