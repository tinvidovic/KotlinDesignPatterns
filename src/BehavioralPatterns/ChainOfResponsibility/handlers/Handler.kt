package BehavioralPatterns.ChainOfResponsibility.handlers

abstract class Handler : IHandler {

    protected var nextHandler : IHandler? = null

    override fun setNext(handler: IHandler) {
        nextHandler = handler
    }

    override fun handle(request: String) {

        if (nextHandler == null){
            println("Request handled.")
        } else {
            nextHandler?.handle(request)
        }
    }

}