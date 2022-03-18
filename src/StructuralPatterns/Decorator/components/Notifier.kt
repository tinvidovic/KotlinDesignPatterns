package StructuralPatterns.Decorator.components

class Notifier {

    fun sendEmailNotification(message : String){

        println("Sending $message via e-mail")
    }
}