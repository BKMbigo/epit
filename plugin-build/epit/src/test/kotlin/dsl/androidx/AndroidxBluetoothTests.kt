package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxBluetoothTests {

    @Test
    fun `verify that androidx bluetooth block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.Bluetooth.bluetooth.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                bluetooth("1.0.0") {
                    implementation(Epit.bluetooth)
                    customVersionImplementation(Epit.bluetooth("1.1.2"))
                }
            }
        }
    }

}
