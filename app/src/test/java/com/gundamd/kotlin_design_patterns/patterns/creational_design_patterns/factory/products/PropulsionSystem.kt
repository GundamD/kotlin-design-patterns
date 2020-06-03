package com.gundamd.kotlin_design_patterns.patterns.creational_design_patterns.factory.products

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