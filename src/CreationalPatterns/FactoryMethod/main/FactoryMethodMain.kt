package CreationalPatterns.AbstractFactory.FactoryMethod.main

import CreationalPatterns.AbstractFactory.FactoryMethod.creators.CarFactory
import CreationalPatterns.AbstractFactory.FactoryMethod.creators.ShipFactory
import CreationalPatterns.AbstractFactory.FactoryMethod.creators.TransportFactory
import CreationalPatterns.AbstractFactory.FactoryMethod.creators.TruckFactory

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