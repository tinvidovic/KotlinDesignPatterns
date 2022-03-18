package StructuralPatterns.TemplateMethod.miners

abstract class DataMiner {

    fun extractAndAnalyze(){
        openFile()
        extractData()
        sanitizeData()
        analyzeData()
    }
    open fun openFile() {}
    open fun extractData() {}

    private fun sanitizeData() {

        println("Performing clean up!")
    }

    private fun analyzeData() {

        println("Performing analysis")
    }
}