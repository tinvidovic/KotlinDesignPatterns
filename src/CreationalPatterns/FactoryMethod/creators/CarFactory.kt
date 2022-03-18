package CreationalPatterns.AbstractFactory.FactoryMethod.creators

import CreationalPatterns.AbstractFactory.FactoryMethod.products.Car
import CreationalPatterns.AbstractFactory.FactoryMethod.products.Transport

class CarFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Car()
    }
}