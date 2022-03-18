package StructuralPatterns.Proxy.common_interfaces

interface IThirdPartyLibraryInterface {

    fun getInfo(id: String) : String
    fun download(id: String) : String
}