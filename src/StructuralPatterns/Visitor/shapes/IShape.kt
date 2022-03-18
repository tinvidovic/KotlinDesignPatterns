package StructuralPatterns.Visitor.shapes

import StructuralPatterns.Visitor.visitors.IVisitor

interface IShape {

    fun move(x: Int, y:Int)
    fun accept(visitor : IVisitor)
}