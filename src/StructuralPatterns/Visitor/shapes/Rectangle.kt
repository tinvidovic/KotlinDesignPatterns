package StructuralPatterns.Visitor.shapes

import StructuralPatterns.Visitor.visitors.IVisitor

class Rectangle: IShape {
    override fun move(x: Int, y: Int) {

        println("Moving Rectangle to $x and $y")
    }

    override fun accept(visitor: IVisitor) {

        visitor.visitRectangle(this)
    }
}