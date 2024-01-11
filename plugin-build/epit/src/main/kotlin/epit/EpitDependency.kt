package epit

import epit.annotations.InternalEpitApi

interface EpitDependency {

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    fun withVersion(version: String): String

}
