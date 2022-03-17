package FactoryMethod.main

import FactoryMethod.creators.CarFactory
import FactoryMethod.creators.ShipFactory
import FactoryMethod.creators.TransportFactory
import FactoryMethod.creators.TruckFactory

fun main(){

    var transportFactory : TransportFactory

    transportFactory = CarFactory()

    transportFactory.drive()
    transportFactory.stop()

    transportFactory = TruckFactory()

    transportFactory.drive()
    transportFactory.stop()

    val ship = ShipFactory().createTransport()

    ship.drive()
    ship.stop()
}