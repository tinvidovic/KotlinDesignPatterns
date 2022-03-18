package CreationalPatterns.AbstractFactory.main

import CreationalPatterns.AbstractFactory.creators.IFurnitureFactory
import CreationalPatterns.AbstractFactory.creators.ModernFurnitureFactory
import CreationalPatterns.AbstractFactory.creators.VictorianFurnitureFactory
import CreationalPatterns.AbstractFactory.products.IChair

fun sitOnTheChair(chair: IChair){

    chair.sitOn()
}
fun main(){

    val modernFactory: IFurnitureFactory = ModernFurnitureFactory()
    val victorianFactory: IFurnitureFactory = VictorianFurnitureFactory()

    var chair = modernFactory.createChair()

    sitOnTheChair(chair)

    chair = victorianFactory.createChair()

    sitOnTheChair(chair)

    val table = modernFactory.createTable()

    println(table.hasLegs())
}