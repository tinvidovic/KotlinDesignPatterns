package BehavioralPatterns.Strategy.strategies

class PublicTransportAlgorithm : IRouteAlgorithm {

    override fun getRoute(pointA: String, pointB: String): String {

        return "Created public transport route from $pointA to $pointB"
    }
}