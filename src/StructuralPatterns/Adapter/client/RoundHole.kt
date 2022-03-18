package StructuralPatterns.Adapter.client

import StructuralPatterns.Adapter.products.RoundPeg

class RoundHole(private val radius: Double) {

    fun fits(peg: RoundPeg): Boolean{

        return peg.radius <= radius
    }
}