package BehavioralPatterns.ChainOfResponsibility.handlers

interface IHandler {

    fun setNext(handler : IHandler)
    fun handle(request : String)
}