package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCollectionTests {

    @Test
    fun `verify that androidx collection block implementation adds dependencies`() = testEpitDsl(
        "androidx collection",
        expectedModuleNames = listOf(
            AndroidX.Collection.collection.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                collection("1.0.0") {
                    implementation(Epit.collection)
                    customVersionImplementation(Epit.collection("1.1.2"))
                }
            }
        }
    }

}
