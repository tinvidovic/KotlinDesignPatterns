package FactoryMethod.creators

import FactoryMethod.products.Car
import FactoryMethod.products.Transport

class CarFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Car()
    }
}