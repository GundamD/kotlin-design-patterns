package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.implementation.EpicCookie
import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.bridge.implementation.RareCookie
import org.junit.jupiter.api.Test

class BridgeTest {
    @Test
    fun testBridge() {
        val rareCookieController = AbilityController(RareCookie())
        rareCookieController.enableAbility()
        rareCookieController.disableAbility()
        val epicCookieController = AbilityController(EpicCookie())
        epicCookieController.enableAbility()
        epicCookieController.disableAbility()

        val rareCookieAdvancedAbilityController = AdvancedAbilityController(RareCookie())
        rareCookieAdvancedAbilityController.changeNameAbility("Dash")
    }
}