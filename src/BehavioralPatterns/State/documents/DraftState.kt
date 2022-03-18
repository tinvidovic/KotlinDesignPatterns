package BehavioralPatterns.State.documents

class DraftState() : DocumentState() {

    override fun publish() : IDocumentState {

        println("Moving to ModerationState")

        return ModerationState()
    }
}