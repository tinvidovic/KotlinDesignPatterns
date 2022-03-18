package BehavioralPatterns.Strategy.main

import BehavioralPatterns.Strategy.navigator.Navigator
import BehavioralPatterns.Strategy.strategies.PedestrianRouteAlgorithm
import BehavioralPatterns.Strategy.strategies.PublicTransportAlgorithm

fun main(){

    val (pointA, pointB) = Pair("Here", "There")
    val navigator = Navigator(PedestrianRouteAlgorithm())

    println(navigator.getRoute(pointA, pointB))

    navigator.setRouteAlgorithm(PublicTransportAlgorithm())

    println(navigator.getRoute(pointA, pointB))
}