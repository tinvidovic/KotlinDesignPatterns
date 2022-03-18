package BehavioralPatterns.ChainOfResponsibility.main

import BehavioralPatterns.ChainOfResponsibility.handlers.HandlerOne
import BehavioralPatterns.ChainOfResponsibility.handlers.HandlerThree
import BehavioralPatterns.ChainOfResponsibility.handlers.HandlerTwo

fun main(){

    val handlerOne = HandlerOne()
    val handlerTwo = HandlerTwo()
    val handlerThree = HandlerThree()

    handlerOne.setNext(handlerTwo)
    handlerTwo.setNext(handlerThree)

    handlerOne.handle("my request")
}