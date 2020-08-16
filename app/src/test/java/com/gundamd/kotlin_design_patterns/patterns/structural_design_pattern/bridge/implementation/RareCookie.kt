package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.implementation

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.`interface`.ICookie

class RareCookie : ICookie {
    override var ability: String = "Run"
    override fun enableAbility(): String {
        return "Rare Cookie ability $ability ON"
    }

    override fun disableAbility(): String {
        return "Rare Cookie ability $ability OFF"
    }
}