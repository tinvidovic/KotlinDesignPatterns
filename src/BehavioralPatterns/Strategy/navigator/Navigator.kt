package BehavioralPatterns.Strategy.navigator

import BehavioralPatterns.Strategy.strategies.IRouteAlgorithm

class Navigator(private var routeAlgorithm : IRouteAlgorithm) {

    fun setRouteAlgorithm(routeAlgorithm: IRouteAlgorithm){
        this.routeAlgorithm = routeAlgorithm
    }

    fun getRoute(pointA: String, pointB: String): String {

        return routeAlgorithm.getRoute(pointA, pointB)
    }
}