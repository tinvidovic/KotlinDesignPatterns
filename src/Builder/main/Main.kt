package Builder.main

import Builder.builders.CarBuilder
import Builder.director.Director

fun main(){

    val builder = CarBuilder()
    val director = Director(builder)

    director.buildSUV()

    val suv = builder.build()

    println(suv.toString())

    builder.reset()

    val sportsCar = builder
        .setColor("Yellow")
        .setNumberOfDoors(2)
        .setEngine("V8")

    println(sportsCar.toString())
}