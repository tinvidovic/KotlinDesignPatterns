package BehavioralPatterns.Strategy.strategies

class PedestrianRouteAlgorithm : IRouteAlgorithm {
    override fun getRoute(pointA: String, pointB: String): String {

        return "Created pedestrian route from $pointA to $pointB"
    }
}