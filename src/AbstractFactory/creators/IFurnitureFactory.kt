package AbstractFactory.creators

import AbstractFactory.products.IChair
import AbstractFactory.products.ITable

interface IFurnitureFactory {

    fun createChair() : IChair
    fun createTable() : ITable
}