package CreationalPatterns.AbstractFactory.Prototype.products

class Rectangle(
    override var x: Int,
    override var y: Int,
    var width : Double,
    var height : Double) : Shape() {

    constructor(rectangle : Rectangle) : this(rectangle.x, rectangle.y, rectangle.width, rectangle.height)

    override fun clone() : Shape {

        return Rectangle(this)
    }

    override fun toString(): String {

        return "Rectangle with x:$x , y:$y , width:$width and height:$height"
    }
}