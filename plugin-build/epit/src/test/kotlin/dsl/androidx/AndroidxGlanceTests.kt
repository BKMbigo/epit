package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxGlanceTests {

    @Test
    fun `verify that androidx glance block implementation adds dependencies`() = testEpitDsl(
        "androidx glance",
        expectedModuleNames = listOf(
            AndroidX.Glance.glance.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                glance("1.0.0") {
                    implementation(Epit.glance)
                    customVersionImplementation(Epit.glance("1.1.2"))
                }
            }
        }
    }

}
