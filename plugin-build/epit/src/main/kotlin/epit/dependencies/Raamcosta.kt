package epit.dependencies

import epit.EpitDependency

internal sealed interface Raamcosta : EpitDependency {

    enum class ComposeDestinations(
        internal val moduleName: String
    ) : Raamcosta {
        animations_core(moduleName = "io.github.raamcosta.compose-destinations:animations-core"),
        wear_core(moduleName = "io.github.raamcosta.compose-destinations:wear-core"),
        core(moduleName = "io.github.raamcosta.compose-destinations:core"),
        ksp(moduleName = "io.github.raamcosta.compose-destinations:ksp"),
        codegen(moduleName = "io.github.raamcosta.compose-destinations:codegen");
    }
}
