package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxTracingTests {

    @Test
    fun `verify that androidx tracing block implementation adds dependencies`() = testEpitDsl(
        "androidx tracing",
        expectedModuleNames = listOf(
            AndroidX.Tracing.Tracing.tracing.moduleName,
            AndroidX.Tracing.TracingPerfetto.tracing_perfetto.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                tracing {
                    tracing("1.0.0") {
                        implementation(Epit.tracing)
                        customVersionImplementation(Epit.tracing("1.1.2"))
                    }

                    tracingperfetto("1.0.0") {
                        implementation(Epit.tracing_perfetto)
                        customVersionImplementation(Epit.tracing_perfetto("1.1.2"))
                    }
                }
            }
        }
    }

}
