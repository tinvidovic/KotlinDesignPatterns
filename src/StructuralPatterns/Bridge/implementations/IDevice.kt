package StructuralPatterns.Bridge.implementations

interface IDevice {

    val isEnabled : Boolean
    var volume : Int

    fun enable()
    fun disable()

    fun volumeUp(){
        volume+= 1
    }

    fun volumeDown(){
        volume-=1
    }

    fun mute(){

        volume = 0
    }

}