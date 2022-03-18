package Prototype.products

class Circle(
    override var x: Int,
    override val y: Int,
    val radius : Double
    ) : Shape() {

    constructor(circle : Circle) : this(circle.x, circle.y, circle.radius)

    override fun clone(): Shape {

        return Circle(this)
    }

    override fun toString(): String {

        return "Circle with x:$x , y:$y and radius:$radius"
    }


}