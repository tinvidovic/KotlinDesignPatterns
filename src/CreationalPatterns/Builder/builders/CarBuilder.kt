package CreationalPatterns.AbstractFactory.Builder.builders

import CreationalPatterns.AbstractFactory.Builder.products.Car

class CarBuilder : IBuilder {

    private var car = Car()

    override fun reset() {

        car = Car()
    }

    override fun setColor(color: String): CarBuilder {

        car.setColor(color)

        return this
    }

    override fun setNumberOfDoors(numberOfDoors: Short) : CarBuilder {

        car.setNumberOfDoors(numberOfDoors)

        return this
    }

    override fun setEngine(engine: String): CarBuilder {

        car.setEngineType(engine)

        return this
    }

    fun build(): Car {

        return car
    }
}