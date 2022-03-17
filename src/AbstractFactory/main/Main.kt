package AbstractFactory.main

import AbstractFactory.creators.IFurnitureFactory
import AbstractFactory.creators.ModernFurnitureFactory
import AbstractFactory.creators.VictorianFurnitureFactory
import AbstractFactory.products.IChair

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