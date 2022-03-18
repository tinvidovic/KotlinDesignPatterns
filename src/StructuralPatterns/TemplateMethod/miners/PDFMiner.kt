package StructuralPatterns.TemplateMethod.miners

class PDFMiner : DataMiner() {
    override fun openFile() {

        println("Opening PDF file!")
    }

    override fun extractData() {

        println("Extracting PDF data!")
    }
}