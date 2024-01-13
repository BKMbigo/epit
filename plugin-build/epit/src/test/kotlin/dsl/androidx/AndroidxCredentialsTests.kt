package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCredentialsTests {

    @Test
    fun `verify that androidx credentials block implementation adds dependencies`() = testEpitDsl(
        "androidx credentials",
        expectedModuleNames = listOf(
            AndroidX.Credentials.credentials.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                credentials("1.0.0") {
                    implementation(Epit.credentials)
                    customVersionImplementation(Epit.credentials("1.1.2"))
                }
            }
        }
    }

}
