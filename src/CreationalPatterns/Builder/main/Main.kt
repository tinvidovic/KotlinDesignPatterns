package CreationalPatterns.AbstractFactory.Builder.main

import CreationalPatterns.AbstractFactory.Builder.builders.CarBuilder
import CreationalPatterns.AbstractFactory.Builder.builders.CarManualBuilder
import CreationalPatterns.AbstractFactory.Builder.director.Director

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

    println(sportsCar.build().toString())

    builder.reset()

    val carManualBuilder = CarManualBuilder()
    director.setBuilder(carManualBuilder)

    director.buildSUV()
    val suvManual = carManualBuilder.build()

    println(suvManual.toString())
}