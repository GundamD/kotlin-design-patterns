package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.factory.products

data class Gundam(
    val name: String? = "",
    val material: ArmorMaterial? = null,
    val propulsionSystem: PropulsionSystem? = null
)


