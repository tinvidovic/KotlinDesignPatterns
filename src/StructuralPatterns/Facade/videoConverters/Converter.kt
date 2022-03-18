package StructuralPatterns.Facade.videoConverters

class Converter(private val fullFileName : String) {

    fun getConverted() = "Converted: $fullFileName !"
}