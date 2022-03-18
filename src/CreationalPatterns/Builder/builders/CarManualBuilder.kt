package CreationalPatterns.AbstractFactory.Builder.builders

import CreationalPatterns.AbstractFactory.Builder.products.CarManual

class CarManualBuilder : IBuilder {

    private var carManual = CarManual()

    override fun reset() {

        carManual = CarManual()
    }

    override fun setColor(color: String) : CarManualBuilder {

        carManual.setColor(color)

        return this
    }

    override fun setNumberOfDoors(numberOfDoors: Short) : CarManualBuilder {

        carManual.setNumberOfDoors(numberOfDoors)

        return this
    }

    override fun setEngine(engine: String) : CarManualBuilder {

        carManual.setEngineType(engine)

        return this
    }

    fun build(): CarManual {

        return carManual
    }

}