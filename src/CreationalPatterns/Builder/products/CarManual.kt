package CreationalPatterns.AbstractFactory.Builder.products

class CarManual {

    private var color : String = "The color is Blue"
    private var numberOfDoors : Short = 4
    private var engineType : String = "Diesel Engine"

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

        return "$color Car manual with $numberOfDoors doors and $engineType engine."
    }
}