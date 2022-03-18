package CreationalPatterns.AbstractFactory.FactoryMethod.products

import java.util.*

class Ship(private val color: String = "Blue") : Transport("SHIP") {

    override fun drive() {

        super.drive()
        println("${color.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }} Ship specific action")
    }

    override fun stop() {

        super.stop()
        println("Ship specific action")
    }
}