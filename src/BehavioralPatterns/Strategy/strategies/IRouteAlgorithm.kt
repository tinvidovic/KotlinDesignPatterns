package BehavioralPatterns.Strategy.strategies

interface IRouteAlgorithm {

    fun getRoute(pointA : String, pointB : String) : String
}