package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.implementation

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.`interface`.ICookie

class EpicCookie : ICookie {
    override var ability: String = "Power"
    override fun enableAbility(): String {
        return "Epic Cookie ability $ability ON"
    }

    override fun disableAbility(): String {
        return "Epic Cookie ability $ability OFF"
    }
}