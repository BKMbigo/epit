package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxEmoji2Version {

    @Test
    fun `verify that androidx emoji2 block implementation adds dependencies`() = testEpitDsl(
        "androidx emoji2",
        expectedModuleNames = listOf(
            AndroidX.Emoji2.emoji2.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                emoji2("1.0.0") {
                    implementation(Epit.emoji2)
                    customVersionImplementation(Epit.emoji2("1.1.2"))
                }
            }
        }
    }

}
