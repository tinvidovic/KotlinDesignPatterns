package BehavioralPatterns.ChainOfResponsibility.handlers

class HandlerOne : Handler() {

    override fun handle(request: String) {

        println("HandlerOne handling request: $request")

        super.handle(request)
    }
}