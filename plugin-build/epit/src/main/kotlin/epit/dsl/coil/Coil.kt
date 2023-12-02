package epit.dsl.coil

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon

@ExperimentalEpitApi
enum class Coil(
    internal val moduleName: String
) : EpitDependency {
    coil(moduleName = "io.coil-kt:coil"),
    coil_base(moduleName = "io.coil-kt:coil-base"),
    coil_compose(moduleName = "io.coil-kt:coil-compose"),
    coil_compose_base(moduleName = "io.coil-kt:coil-compose-base"),
    coil_gif(moduleName = "io.coil-kt:coil-gif"),
    coil_svg(moduleName = "io.coil-kt:coil-svg"),
    coil_video(moduleName = "io.coil-kt:coil-video"),
    coil_test(moduleName = "io.coil-kt:coil-test"),
    coil_bom(moduleName = "io.coil-kt:coil-bom");

    override fun withVersion(version: String): String = moduleName joinWithColon version
}
