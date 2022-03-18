package CreationalPatterns.AbstractFactory.creators

import CreationalPatterns.AbstractFactory.products.IChair
import CreationalPatterns.AbstractFactory.products.ITable
import CreationalPatterns.AbstractFactory.products.VictorianChair
import CreationalPatterns.AbstractFactory.products.VictorianTable

class VictorianFurnitureFactory : IFurnitureFactory {
    override fun createChair(): IChair {

        return VictorianChair()
    }

    override fun createTable(): ITable {

        return VictorianTable()
    }
}