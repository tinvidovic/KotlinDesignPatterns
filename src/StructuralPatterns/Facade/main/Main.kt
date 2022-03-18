package StructuralPatterns.Facade.main

import StructuralPatterns.Facade.facades.MyVideoConverter

fun main() {

    val myConverter = MyVideoConverter()

    println(myConverter.convert("someFile"))
}