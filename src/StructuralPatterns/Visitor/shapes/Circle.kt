package StructuralPatterns.Visitor.shapes

import StructuralPatterns.Visitor.visitors.IVisitor

class Circle : IShape {
    override fun move(x: Int, y: Int) {

        println("Moving Circle to $x and $y")
    }

    override fun accept(visitor: IVisitor) {

        visitor.visitCircle(this)
    }
}