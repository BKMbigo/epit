package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxEmojiVersion {

    @Test
    fun `verify that androidx emoji block implementation adds dependencies`() = testEpitDsl(
        "androidx emoji",
        expectedModuleNames = listOf(
            AndroidX.Emoji.emoji.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                emoji("1.0.0") {
                    implementation(Epit.emoji)
                    customVersionImplementation(Epit.emoji("1.1.2"))
                }
            }
        }
    }

}
