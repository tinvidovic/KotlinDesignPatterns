package Builder.products

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
}