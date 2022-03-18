package CreationalPatterns.AbstractFactory.FactoryMethod.creators

import CreationalPatterns.AbstractFactory.FactoryMethod.products.Transport
import CreationalPatterns.AbstractFactory.FactoryMethod.products.Truck

class TruckFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Truck()
    }
}