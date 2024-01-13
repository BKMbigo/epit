package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxComposeCompilerTests {

    @Test
    fun `verify that androidx compose compiler block implementation adds dependencies`() = testEpitDsl(
        "androidx compose compiler",
        expectedModuleNames = listOf(
            AndroidX.Compose.Compiler.compiler.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    compiler("1.0.0") {
                        implementation(Epit.compiler)
                        customVersionImplementation(Epit.compiler("1.1.2"))
                    }
                }
            }
        }
    }

}
