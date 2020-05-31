package com.gundamd.kotlin_design_patterns.patterns.factory.products

interface ArmorMaterial {
    var material: String
}

data class ArmorMaterialGundamBarbatos(override var material: String) : ArmorMaterial


data class ArmorMaterialGundamUnicon(override var material: String) : ArmorMaterial

