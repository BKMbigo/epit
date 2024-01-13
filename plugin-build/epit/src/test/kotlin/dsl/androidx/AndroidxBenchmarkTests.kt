package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxBenchmarkTests {

    @Test
    fun `verify that androidx benchmark block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.Benchmark.benchmark_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                benchmark("1.0.0") {
                    implementation(Epit.benchmark_common)
                    customVersionImplementation(Epit.benchmark_common("1.1.2"))
                }
            }
        }
    }

}
