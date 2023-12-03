package epit.dsl.raamcosta

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon

@ExperimentalEpitApi
sealed interface Raamcosta : EpitDependency {

    @ExperimentalEpitApi
    enum class ComposeDestinations(
        internal val moduleName: String
    ) : Raamcosta {
        animations_core(moduleName = "io.github.raamcosta.compose-destinations:animations-core"),
        wear_core(moduleName = "io.github.raamcosta.compose-destinations:wear-core"),
        core(moduleName = "io.github.raamcosta.compose-destinations:core"),
        ksp(moduleName = "io.github.raamcosta.compose-destinations:ksp"),
        codegen(moduleName = "io.github.raamcosta.compose-destinations:codegen");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }
}
