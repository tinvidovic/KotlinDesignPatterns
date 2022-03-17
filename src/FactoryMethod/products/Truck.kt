package FactoryMethod.products

class Truck : Transport("TRUCK") {

    override fun drive() {

        super.drive()
        println("Truck specific action")
    }

    override fun stop() {

        super.stop()
        println("Truck specific action")
    }
}