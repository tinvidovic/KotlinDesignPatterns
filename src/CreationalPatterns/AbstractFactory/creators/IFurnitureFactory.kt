package CreationalPatterns.AbstractFactory.creators

import CreationalPatterns.AbstractFactory.products.IChair
import CreationalPatterns.AbstractFactory.products.ITable

interface IFurnitureFactory {

    fun createChair() : IChair
    fun createTable() : ITable
}