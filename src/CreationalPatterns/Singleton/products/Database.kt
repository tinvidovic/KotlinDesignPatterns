package CreationalPatterns.AbstractFactory.Singleton.products

object Database {

    var version : Int = 1
    val database : String
        get() {

            return "This is the database v$version"
        }

    fun updateVersion(){

        version += 1
    }
}