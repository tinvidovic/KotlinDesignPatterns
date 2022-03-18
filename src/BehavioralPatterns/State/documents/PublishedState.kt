package BehavioralPatterns.State.documents

class PublishedState()  : DocumentState() {

    override fun publish() : IDocumentState {

        println("Document already in PublishedState")
        return this
    }
}