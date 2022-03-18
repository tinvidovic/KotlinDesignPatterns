package StructuralPatterns.Visitor.visitors

import StructuralPatterns.Visitor.shapes.Circle
import StructuralPatterns.Visitor.shapes.Rectangle

interface IVisitor {

    fun visitCircle(circle : Circle)
    fun visitRectangle(rectangle: Rectangle)

}