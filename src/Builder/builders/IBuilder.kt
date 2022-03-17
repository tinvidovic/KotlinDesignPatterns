package Builder.builders

interface IBuilder {

    fun reset()

    fun setColor(color: String) : IBuilder

    fun setNumberOfDoors(numberOfDoors: Short) : IBuilder

    fun setEngine(engine: String) : IBuilder
}