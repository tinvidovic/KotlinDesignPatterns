package StructuralPatterns.Bridge.implementations

class Radio(
    override var isEnabled: Boolean,
    override var volume: Int
    ) : IDevice {

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }

}