package CreationalPatterns.AbstractFactory.Builder.director

import CreationalPatterns.AbstractFactory.Builder.builders.IBuilder

class Director(private var builder : IBuilder) {

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