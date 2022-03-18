package BehavioralPatterns.ChainOfResponsibility.handlers

class HandlerThree : Handler() {

    override fun handle(request: String) {

        println("HandlerThree handling request: $request")

        super.handle(request)
    }
}