package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxProfileInstallerTests {

    @Test
    fun `verify that androidx profileInstaller block implementation adds dependencies`() = testEpitDsl(
        "androidx profileInstaller",
        expectedModuleNames = listOf(
            AndroidX.ProfileInstaller.profileinstaller.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                profileinstaller("1.0.0") {
                    implementation(Epit.profileinstaller)
                    customVersionImplementation(Epit.profileinstaller("1.1.2"))
                }
            }
        }
    }

}
