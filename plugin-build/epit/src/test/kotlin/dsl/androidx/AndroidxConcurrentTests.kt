package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxConcurrentTests {

    @Test
    fun `verify that androidx concurrent block implementation adds dependencies`() = testEpitDsl(
        "androidx concurrent",
        expectedModuleNames = listOf(
            AndroidX.Concurrent.concurrent_futures.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                concurrent("1.0.0") {
                    implementation(Epit.concurrent_futures)
                    customVersionImplementation(Epit.concurrent_futures("1.1.2"))
                }
            }
        }
    }

}
