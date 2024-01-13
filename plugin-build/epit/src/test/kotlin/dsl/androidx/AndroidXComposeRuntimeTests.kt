package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidXComposeRuntimeTests {

    @Test
    fun `verify that androidx compose runtime block implementation adds dependencies`() = testEpitDsl(
        "androidx compose runtime",
        expectedModuleNames = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    runtime {
                        runtime("1.0.0") {
                            implementation(Epit.runtime)
                            customVersionImplementation(Epit.runtime("1.1.2"))
                        }

                        runtimeTracing("1.0.0") {
                            implementation(Epit.runtime_tracing)
                            customVersionImplementation(Epit.runtime_tracing("1.1.2"))
                        }
                    }
                }
            }
        }
    }

}
