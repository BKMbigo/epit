package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxExifInterface {

    @Test
    fun `verify that androidx exifInterface block implementation adds dependencies`() = testEpitDsl(
        "androidx exifInterface",
        expectedModuleNames = listOf(
            AndroidX.ExifInterface.exifinterface.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                exifinterface("1.0.0") {
                    implementation(Epit.exifinterface)
                    customVersionImplementation(Epit.exifinterface("1.1.2"))
                }
            }
        }
    }

}
