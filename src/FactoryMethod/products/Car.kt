package FactoryMethod.products

class Car : Transport("CAR") {

    override fun drive() {

        super.drive()
        println("Car specific action")
    }

    override fun stop() {

        super.stop()
        println("Car specific action")
    }
}