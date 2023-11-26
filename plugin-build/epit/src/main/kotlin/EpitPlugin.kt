import org.gradle.api.Plugin
import org.gradle.api.Project

class EpitPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // The Extension will be applied on a later release
//            extensions.create(
//                EpitExtension::class,
//                "epit",
//                EpitExtensionImpl::class
//            )
        }
    }

}
