package CreationalPatterns.AbstractFactory.products

class VictorianChair : IChair {
    override fun sitOn() {

        println("Sitting on a Victorian chair")
    }

    override fun hasLegs() : Boolean {

        return true
    }
}