package AbstractFactory.creators

import AbstractFactory.products.IChair
import AbstractFactory.products.ITable
import AbstractFactory.products.VictorianChair
import AbstractFactory.products.VictorianTable

class VictorianFurnitureFactory : IFurnitureFactory {
    override fun createChair(): IChair {

        return VictorianChair()
    }

    override fun createTable(): ITable {

        return VictorianTable()
    }
}