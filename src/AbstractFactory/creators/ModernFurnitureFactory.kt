package AbstractFactory.creators

import AbstractFactory.products.IChair
import AbstractFactory.products.ITable
import AbstractFactory.products.ModernChair
import AbstractFactory.products.ModernTable

class ModernFurnitureFactory : IFurnitureFactory {
    override fun createChair(): IChair {

        return ModernChair()
    }

    override fun createTable(): ITable {

        return ModernTable()
    }
}