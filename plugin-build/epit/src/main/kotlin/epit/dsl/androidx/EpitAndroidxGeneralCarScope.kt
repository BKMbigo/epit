package epit.dsl.androidx

import epit.annotations.EpitDsl

@EpitDsl
object EpitAndroidxGeneralCarScope {

    fun app(carAppVersion: String, block: EpitAndroidXCarAppScope.() -> Unit) {
        block(EpitAndroidXCarAppScope(carAppVersion))
    }

}
