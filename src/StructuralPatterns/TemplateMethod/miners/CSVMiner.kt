package StructuralPatterns.TemplateMethod.miners

class CSVMiner : DataMiner() {
    override fun openFile() {

        println("Opening CSV file!")
    }

    override fun extractData() {

        println("Extracting CSV data!")
    }
}