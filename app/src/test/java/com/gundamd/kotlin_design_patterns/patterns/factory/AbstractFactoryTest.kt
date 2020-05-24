package com.gundamd.kotlin_design_patterns.patterns.factory

import com.gundamd.kotlin_design_patterns.patterns.factory.data.*
import org.junit.jupiter.api.Test



abstract class GundamAbstractFactory {
    abstract fun createName(): String
    abstract fun createBodyFrame(): ArmorMaterial
    abstract fun createPropulsionSystem(): PropulsionSystem
}


private class GundamUniconAbstractFactory : GundamAbstractFactory() {
    override fun createName(): String {
        return " Gundam Unicon"
    }

    override fun createBodyFrame(): ArmorMaterial {
        return ArmorMaterialGundamUnicon("Gundarium Alloy")
    }

    override fun createPropulsionSystem(): PropulsionSystem {

        return PropulsionSystemGundamUnicon(
            "Minovsky Ultracompact Fusion Reactor",
            "Newtype Destroyer System"
        )
    }
}

private class GundamBarbatosAbstractFactory : GundamAbstractFactory() {
    override fun createName(): String {
        return "Gundam Barbatos"
    }

    override fun createBodyFrame(): ArmorMaterial {
        return ArmorMaterialGundamBarbatos("Nanolaminate Armor")
    }

    override fun createPropulsionSystem(): PropulsionSystem {
        return PropulsionSystemGundamBarbatos(
            "Ahab Thrusters Thermal Phase Transition Thrusters",
            ""
        )
    }
}


class AbstractFactoryTest {

    @Test
     fun abstractFactory() {
        val factory1 = initial("unicon")
        val name1 = factory1?.createName()
        val bodyFrame1 = factory1?.createBodyFrame()
        val propulsionSystem1 = factory1?.createPropulsionSystem()
        assemble(name1!!, bodyFrame1!!, propulsionSystem1!!)
        val factory2 = initial("barbatos")
        val name2 = factory2?.createName()
        val bodyFrame2 = factory2?.createBodyFrame()
        val propulsionSystem2 = factory2?.createPropulsionSystem()
        assemble(name2!!, bodyFrame2!!, propulsionSystem2!!)
    }

    private fun assemble(name: String, bodyFrame: ArmorMaterial, propulsionSystem: PropulsionSystem) {

        val gundam = Gundam(name, bodyFrame, propulsionSystem)
        println(gundam.name)
        println("-----------------------------")
        println(gundam.material?.material)
        println(gundam.propulsionSystem?.engine)
        println(gundam.propulsionSystem?.secretEngine)
        println("==========================")
    }

    private fun initial(type: String): GundamAbstractFactory? {
        return when (type) {
            "unicon" -> GundamUniconAbstractFactory()
            "barbatos" -> GundamBarbatosAbstractFactory()
            else -> null
        }

    }
}