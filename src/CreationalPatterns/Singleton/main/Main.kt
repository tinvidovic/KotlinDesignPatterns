package CreationalPatterns.AbstractFactory.Singleton.main

import CreationalPatterns.AbstractFactory.Singleton.products.Database

fun main(){

    val databaseInstance = Database

    val anotherDatabaseInstance = Database

    //Changing the database version in any instance, should affect all instances
    Database.updateVersion()

    println(databaseInstance.database)
    println(anotherDatabaseInstance.database)

    databaseInstance.updateVersion()

    println(databaseInstance.database)
    println(anotherDatabaseInstance.database)
}