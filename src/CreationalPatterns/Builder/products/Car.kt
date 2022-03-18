package CreationalPatterns.AbstractFactory.Builder.products

class Car {

    private var color : String = "Blue"
    private var numberOfDoors : Short = 4
    private var engineType : String = "Diesel"

    fun setColor(color : String) {
        this.color = color
    }

    fun setNumberOfDoors(numberOfDoors : Short) {
        this.numberOfDoors = numberOfDoors
    }

    fun setEngineType(engineType : String) {
        this.engineType = engineType
    }

    override fun toString(): String {

        return "$color Car with $numberOfDoors doors and $engineType engine."
    }
}