package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDataStoreTests {

    @Test
    fun `verify that androidx data store block implementation adds dependencies`() = testEpitDsl(
        "androidx data store",
        expectedModuleNames = listOf(
            AndroidX.DataStore.datastore.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                datastore("1.0.0") {
                    implementation(Epit.datastore)
                    customVersionImplementation(Epit.datastore("1.1.2"))
                }
            }
        }
    }

}
