package FactoryMethod.creators

import FactoryMethod.products.Ship
import FactoryMethod.products.Transport

class ShipFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Ship()
    }
}
