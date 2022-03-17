package FactoryMethod.products

abstract class Transport(protected val name : String? = null) : ITransport {

    override fun drive() {

        println("Driving the $name")
    }

    override fun stop() {

        println("Stopping the $name")
    }
}