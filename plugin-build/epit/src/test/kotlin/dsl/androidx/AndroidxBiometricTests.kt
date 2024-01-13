package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxBiometricTests {

    @Test
    fun `verify that androidx biometric block implementation adds dependencies`() = testEpitDsl(
        "androidx biometric",
        expectedModuleNames = listOf(
            AndroidX.Biometric.biometric.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                biometric("1.0.0") {
                    implementation(Epit.biometric)
                    customVersionImplementation(Epit.biometric("1.1.2"))
                }
            }
        }
    }

}
