package com.gundamd.kotlin_design_patterns.patterns.factory

import com.gundamd.kotlin_design_patterns.patterns.factory.products.*
import org.junit.jupiter.api.Test


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

        return PropulsionSystemGundamUnicon(
            "Minovsky Ultracompact Fusion Reactor",
            "Newtype Destroyer System"
        )
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
        return PropulsionSystemGundamBarbatos(
            "Ahab Thrusters Thermal Phase Transition Thrusters",
            ""
        )
    }
}


class FactoryMethodTest {

    @Test
     fun factoryMethod() {
        val factory1 = initial("unicon")
        factory1?.assemble()
        val factory2 = initial("barbatos")
        factory2?.assemble()
    }

  private  fun initial(type: String): GundamFactory? {
      return when (type) {
          "unicon" -> GundamUniconFactory()
          "barbatos" -> GundamBarbatosFactory()
          else -> null
      }

    }
}