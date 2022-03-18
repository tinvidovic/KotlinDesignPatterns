package StructuralPatterns.TemplateMethod.main

import StructuralPatterns.TemplateMethod.miners.CSVMiner
import StructuralPatterns.TemplateMethod.miners.PDFMiner

fun main () {

    val pdfMiner = PDFMiner()
    pdfMiner.extractAndAnalyze()

    println()

    val csvMiner = CSVMiner()
    csvMiner.extractAndAnalyze()
}