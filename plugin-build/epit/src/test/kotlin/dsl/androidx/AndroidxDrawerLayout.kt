package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDrawerLayout {

    @Test
    fun `verify that androidx drawerLayout block implementation adds dependencies`() = testEpitDsl(
        "androidx drawerLayout",
        expectedModuleNames = listOf(
            AndroidX.DrawerLayout.drawerlayout.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                drawerlayout("1.0.0") {
                    implementation(Epit.drawerlayout)
                    customVersionImplementation(Epit.drawerlayout("1.1.2"))
                }
            }
        }
    }

}
