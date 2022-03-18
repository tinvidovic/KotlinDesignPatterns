package BehavioralPatterns.State.documents

class ModerationState()  : DocumentState() {

    override fun publish() : IDocumentState {

        println("Moving to PublishedState")

        return PublishedState()
    }
}