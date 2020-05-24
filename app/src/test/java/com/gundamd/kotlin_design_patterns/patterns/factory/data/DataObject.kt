package com.gundamd.kotlin_design_patterns.patterns.factory.data

data class Gundam(
    val name: String? = "",
    val material: ArmorMaterial? = null,
    val propulsionSystem: PropulsionSystem? = null
)


interface ArmorMaterial {
    var material: String
}

data class ArmorMaterialGundamBarbatos(override var material: String) : ArmorMaterial


data class ArmorMaterialGundamUnicon(override var material: String) : ArmorMaterial

interface PropulsionSystem {
    var engine: String
    var secretEngine: String
}

data class PropulsionSystemGundamBarbatos(
    override var engine: String,
    override var secretEngine: String
) : PropulsionSystem


data class PropulsionSystemGundamUnicon(
    override var engine: String,
    override var secretEngine: String
) : PropulsionSystem