package com.gundamd.kotlin_design_patterns.patterns.factory

import org.junit.jupiter.api.Test


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

data class PropulsionSystemGundamBarbatos(override var engine: String, override var secretEngine: String) : PropulsionSystem


data class PropulsionSystemGundamUnicon(override var engine: String, override var secretEngine: String) : PropulsionSystem

abstract class GundamFactory {

    fun assemble() {
        val name = createName()
        val bodyFrame = createBodyFrame()
        val propulsionSystem = createPropulsionSystem()
        val gundam = Gundam(name, bodyFrame, propulsionSystem)
        println(gundam.name)
        println("-----------------------------")
        println(gundam.material?.material)
        println(gundam.propulsionSystem?.engine)
        println(gundam.propulsionSystem?.secretEngine)
        println("==========================")
    }

    abstract fun createName(): String
    abstract fun createBodyFrame(): ArmorMaterial
    abstract fun createPropulsionSystem(): PropulsionSystem
}

class GundamUniconFactory : GundamFactory() {
    override fun createName(): String {
        return " Gundam Unicon"
    }

    override fun createBodyFrame(): ArmorMaterial {
        return ArmorMaterialGundamUnicon("Gundarium Alloy")
    }

    override fun createPropulsionSystem(): PropulsionSystem {

        return PropulsionSystemGundamUnicon("Minovsky Ultracompact Fusion Reactor","Newtype Destroyer System")
    }
}

class GundamBarbatosFactory : GundamFactory() {
    override fun createName(): String {
        return "Gundam Barbatos"
    }

    override fun createBodyFrame(): ArmorMaterial {
        return ArmorMaterialGundamBarbatos("Nanolaminate Armor")
    }

    override fun createPropulsionSystem(): PropulsionSystem {
        return PropulsionSystemGundamBarbatos("Ahab Thrusters Thermal Phase Transition Thrusters","")
    }
}


class FactoryMethodTest {

    @Test
    fun FactoryMethod() {
        GundamUniconFactory().assemble()
        GundamBarbatosFactory().assemble()

    }
}