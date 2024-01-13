package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxSQLiteTests {

    @Test
    fun `verify that androidx sqlite block implementation adds dependencies`() = testEpitDsl(
        "androidx sqlite",
        expectedModuleNames = listOf(
            AndroidX.SQLite.sqlite.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                sqlite("1.0.0") {
                    implementation(Epit.sqlite)
                    customVersionImplementation(Epit.sqlite("1.1.2"))
                }
            }
        }
    }

}
