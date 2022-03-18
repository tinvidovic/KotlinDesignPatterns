package StructuralPatterns.Bridge.main

import StructuralPatterns.Bridge.abstractions.AdvancedRemoteControl
import StructuralPatterns.Bridge.abstractions.RemoteControl
import StructuralPatterns.Bridge.implementations.TV

fun main(){

    val tv = TV(false, 0)
    val remote = RemoteControl(tv)

    remote.togglePower()

    println(tv.isEnabled)

    val advancedRemote = AdvancedRemoteControl(tv)

    for (i in 1..10)
        advancedRemote.volumeUp()

    println(tv.volume)

    advancedRemote.mute()

    println(tv.volume)
}