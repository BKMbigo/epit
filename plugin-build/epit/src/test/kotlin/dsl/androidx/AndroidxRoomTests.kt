package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxRoomTests {

    @Test
    fun `verify that androidx room block implementation adds dependencies`() = testEpitDsl(
        "androidx room",
        expectedModuleNames = listOf(
            AndroidX.Room.room_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                room("1.0.0") {
                    implementation(Epit.room_common)
                    customVersionImplementation(Epit.room_common("1.1.2"))
                }
            }
        }
    }

}
