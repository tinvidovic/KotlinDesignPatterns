package StructuralPatterns.Adapter.main

import StructuralPatterns.Adapter.adapter.SquarePegAdapter
import StructuralPatterns.Adapter.client.RoundHole
import StructuralPatterns.Adapter.products.RoundPeg
import StructuralPatterns.Adapter.products.SquarePeg

fun main(){

    val hole = RoundHole(5.0)

    val roundPeg = RoundPeg(5.0)
    println(hole.fits(roundPeg))

    val smallSquarePeg = SquarePeg(5.0)
    val largeSquarePeg = SquarePeg(10.0)

    //hole.fits(smallSquarePeg), doesn't compile

    val smallSquarePegAdapter = SquarePegAdapter(smallSquarePeg)
    val largeSquarePegAdapter = SquarePegAdapter(largeSquarePeg)

    println(hole.fits(smallSquarePegAdapter))
    println(hole.fits(largeSquarePegAdapter))
}