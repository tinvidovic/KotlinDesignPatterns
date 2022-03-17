package FactoryMethod.creators

import FactoryMethod.products.Transport

abstract class TransportFactory {

    abstract fun createTransport() : Transport

    fun drive() {

        val transport = createTransport()
        transport.drive()
    }

    fun stop() {

        val transport = createTransport()
        transport.stop()
    }
}