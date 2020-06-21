package com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter

import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products.CommonCookie
import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products.RareCookie
import com.gundamd.kotlin_design_patterns.patterns.structural_design_pattern.adapter.products.RareToCommonCookie
import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun testAdapter() {
        val commonCookie= CommonCookie()
        commonCookie.genCookie("Strawberry Cookie1")
        commonCookie.asembleCommonCookie()

        val rareCookie= RareCookie()
        rareCookie.genCookie("Ninja")
        rareCookie.asembleRareCookie()


        val rareCookieAdapter= RareToCommonCookie(rareCookie)
        rareCookieAdapter.genCookie("Ninja Adapter")
        rareCookieAdapter.asembleCommonCookie()

    }



}