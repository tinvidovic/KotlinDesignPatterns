package StructuralPatterns.Proxy.some_library

import StructuralPatterns.Proxy.common_interfaces.IThirdPartyLibraryInterface

class ThirdPartyLibraryClass : IThirdPartyLibraryInterface {
    override fun getInfo(id: String): String {

        return "Info for $id"
    }

    override fun download(id: String): String {

        return "Downloaded $id"
    }
}