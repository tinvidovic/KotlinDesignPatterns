package StructuralPatterns.Bridge.abstractions

import StructuralPatterns.Bridge.implementations.IDevice

open class RemoteControl(protected val device : IDevice) {

    fun togglePower(){

        if (device.isEnabled)
            device.disable()
        else
            device.enable()
    }

}