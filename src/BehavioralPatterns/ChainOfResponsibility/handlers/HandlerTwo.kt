package BehavioralPatterns.ChainOfResponsibility.handlers

class HandlerTwo : Handler() {

    override fun handle(request: String) {

        println("HandlerTwo handling request: $request")

        super.handle(request)
    }
}