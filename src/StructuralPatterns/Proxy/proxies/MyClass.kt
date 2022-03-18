package StructuralPatterns.Proxy.proxies

import StructuralPatterns.Proxy.common_interfaces.IThirdPartyLibraryInterface

class MyClass(private val service : IThirdPartyLibraryInterface) : IThirdPartyLibraryInterface {

    override fun getInfo(id: String): String {

        checkAccess()
        val result = service.getInfo(id)
        cleanUp()

        return result
    }

    override fun download(id: String): String {

        checkAccess()
        val result = service.download(id)
        cleanUp()

        return result
    }

    private fun checkAccess(){

        println("Checking access!")
    }

    private fun cleanUp(){

        println("Cleaning up!")
    }
}