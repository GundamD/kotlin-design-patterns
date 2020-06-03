package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.singleton.products

class Cookie {

    var name: String? = null

    companion object {
        private var obj: Cookie? = null
        val instance: Cookie
            get() {
                if (obj == null) {
                    obj = Cookie()
                }
                return obj as Cookie
            }
    }
}
