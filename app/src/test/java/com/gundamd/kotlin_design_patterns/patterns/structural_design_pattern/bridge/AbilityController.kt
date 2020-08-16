package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.`interface`.ICookie

open class AbilityController(iCookie: ICookie) {
    var iCookie: ICookie? = iCookie

    fun enableAbility() {
        println( iCookie?.enableAbility())
    }

    fun disableAbility() {
        println( iCookie?.disableAbility())
    }
}