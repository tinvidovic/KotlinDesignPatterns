package BehavioralPatterns.State.main

import BehavioralPatterns.State.documents.Document
import BehavioralPatterns.State.documents.DraftState

fun main(){

    val document = Document(DraftState(), "The documents text")

    document.publish()

    println(document.getDocumentText())

    document.publish()
}