package AbstractFactory.products

class ModernChair : IChair {

    override fun sitOn() {

        println("Sitting on a Modern chair")
    }

    override fun hasLegs() : Boolean {

        return false
    }
}