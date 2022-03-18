package StructuralPatterns.Proxy.main

import StructuralPatterns.Proxy.proxies.MyClass
import StructuralPatterns.Proxy.some_library.ThirdPartyLibraryClass

fun main(){

    val myClass = MyClass(ThirdPartyLibraryClass())

    println(myClass.getInfo("7124jkd172"))

    println(myClass.download("7124jkd172"))
}