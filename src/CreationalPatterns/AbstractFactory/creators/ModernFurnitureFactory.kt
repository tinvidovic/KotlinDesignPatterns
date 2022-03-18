package CreationalPatterns.AbstractFactory.creators

import CreationalPatterns.AbstractFactory.products.IChair
import CreationalPatterns.AbstractFactory.products.ITable
import CreationalPatterns.AbstractFactory.products.ModernChair
import CreationalPatterns.AbstractFactory.products.ModernTable

class ModernFurnitureFactory : IFurnitureFactory {
    override fun createChair(): IChair {

        return ModernChair()
    }

    override fun createTable(): ITable {

        return ModernTable()
    }
}