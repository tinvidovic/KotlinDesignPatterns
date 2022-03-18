package StructuralPatterns.Adapter.adapter

import StructuralPatterns.Adapter.products.RoundPeg
import StructuralPatterns.Adapter.products.SquarePeg
import kotlin.math.sqrt

class SquarePegAdapter(peg: SquarePeg) : RoundPeg(peg.width * sqrt(2.0)/2)