package BehavioralPatterns.State.documents

class Document(
    private var state : IDocumentState,
    private var documentText : String
    ) {

    fun publish(){

        state = state.publish()
    }

    fun getDocumentText() : String {

        return documentText
    }
}