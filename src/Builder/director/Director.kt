package Builder.director

import Builder.builders.CarBuilder
import Builder.builders.IBuilder

class Director(private var builder : IBuilder) {

    fun getBuilder() = builder

    fun setBuilder(builder: IBuilder){

        this.builder = builder
    }

    fun buildSUV(){

        builder.reset()
        builder.setColor("Gray")
        builder.setNumberOfDoors(4)
        builder.setEngine("Diesel")
    }
}