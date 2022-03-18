package CreationalPatterns.AbstractFactory.FactoryMethod.creators

import CreationalPatterns.AbstractFactory.FactoryMethod.products.Ship
import CreationalPatterns.AbstractFactory.FactoryMethod.products.Transport

class ShipFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Ship()
    }
}
