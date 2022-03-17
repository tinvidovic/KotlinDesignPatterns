package FactoryMethod.creators

import FactoryMethod.products.Transport
import FactoryMethod.products.Truck

class TruckFactory : TransportFactory() {

    override fun createTransport(): Transport {

        return Truck()
    }
}