package StructuralPatterns.Decorator.main

import StructuralPatterns.Decorator.components.Notifier

// Decorate the notifier class with an sms notification function

fun Notifier.sendSmsNotification(message: String){

    println("Sending $message via SMS")
}

fun main(){

    val message = "Hello World!"
    val notifier = Notifier()

    notifier.sendEmailNotification(message)

    notifier.sendSmsNotification(message)
}