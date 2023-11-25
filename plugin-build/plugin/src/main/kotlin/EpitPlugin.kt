import extension.EpitExtension
import extension.EpitExtensionImpl
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class EpitPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            extensions.create(
                EpitExtension::class,
                "epit",
                EpitExtensionImpl::class
            )
        }
    }

}
