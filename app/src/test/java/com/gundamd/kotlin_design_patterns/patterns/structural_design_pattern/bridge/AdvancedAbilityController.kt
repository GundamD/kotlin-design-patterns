package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.`interface`.ICookie

class AdvancedAbilityController(iCookie: ICookie) : AbilityController(iCookie) {
    fun changeNameAbility(name: String) {
        val tempNameAbility = iCookie?.ability
        iCookie?.ability = name
        println("Change ability name from " + tempNameAbility + " to " + iCookie?.ability)

    }
}