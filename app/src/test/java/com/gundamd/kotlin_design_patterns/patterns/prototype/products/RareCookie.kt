package com.gundamd.kotlin_design_patterns.patterns.prototype.products

class RareCookie : Cookie() {
    var candy: String? = null

    override fun clone(): Cookie {
        val cloneObject = RareCookie()
        cloneObject.name = this.name
        cloneObject.ability = this.ability
        cloneObject.candy = this.candy
        return cloneObject
    }


}