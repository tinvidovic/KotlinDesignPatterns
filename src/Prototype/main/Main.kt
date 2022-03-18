package Prototype.main

import Prototype.products.Circle
import Prototype.products.Rectangle
import Prototype.products.Shape

fun main() {

    val shapes = mutableListOf<Shape>()

    val circle = Circle(10, 10, 20.0)

    shapes.add(circle)

    val anotherCircle = circle.clone()

    shapes.add(anotherCircle)

    val rectangle = Rectangle(10, 10, 10.0, 10.0)

    shapes.add(rectangle)

    val shapesCopy = mutableListOf<Shape>()

    for (shape in shapes){

        shapesCopy.add(shape.clone())
    }

    shapes[0].x = 20

    println("Original shapes:")
    println(shapes)

    println("Copied shapes")
    println(shapesCopy)
}