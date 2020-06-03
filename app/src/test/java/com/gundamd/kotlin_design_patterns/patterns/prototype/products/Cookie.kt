package com.gundamd.kotlin_design_patterns.patterns.prototype.products

abstract class Cookie {
    var name: String? = null
    var ability: String? = null
    abstract fun clone():Cookie
}