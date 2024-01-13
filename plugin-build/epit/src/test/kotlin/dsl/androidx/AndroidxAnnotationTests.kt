package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxAnnotationTests {

    @Test
    fun `verify that androidx annotation block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.Annotation.annotation_annotation.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                annotation("1.0.0") {
                    implementation(Epit.annotation)
                    customVersionImplementation(Epit.annotation("1.1.2"))
                }
            }
        }
    }

}
