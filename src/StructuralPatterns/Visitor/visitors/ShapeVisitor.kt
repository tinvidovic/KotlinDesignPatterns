package StructuralPatterns.Visitor.visitors

import StructuralPatterns.Visitor.shapes.Circle
import StructuralPatterns.Visitor.shapes.Rectangle

class ShapeVisitor : IVisitor {
    override fun visitCircle(circle: Circle) {

        circle.move(10, 10)
    }

    override fun visitRectangle(rectangle: Rectangle) {

        rectangle.move(20, 20)
    }
}