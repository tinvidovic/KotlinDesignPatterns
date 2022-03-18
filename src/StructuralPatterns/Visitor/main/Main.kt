package StructuralPatterns.Visitor.main

import StructuralPatterns.Visitor.shapes.Circle
import StructuralPatterns.Visitor.shapes.IShape
import StructuralPatterns.Visitor.shapes.Rectangle
import StructuralPatterns.Visitor.visitors.ShapeVisitor

fun main(){

    val shapes = listOf<IShape>(Circle(), Rectangle(), Circle(), Circle())

    for (shape in shapes)
        shape.accept(ShapeVisitor())
}