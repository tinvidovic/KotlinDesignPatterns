package StructuralPatterns.Bridge.abstractions

import StructuralPatterns.Bridge.implementations.IDevice

class AdvancedRemoteControl(device : IDevice) : RemoteControl(device) {

    fun volumeUp() = device.volumeUp()
    fun volumeDown() = device.volumeDown()

    fun mute() = device.mute()
}