package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxSwipeRefreshLayoutTests {

    @Test
    fun `verify that androidx swipeRefreshLayout block implementation adds dependencies`() = testEpitDsl(
        "androidx swipeRefreshLayout",
        expectedModuleNames = listOf(
            AndroidX.SwipeRefreshLayout.swiperefreshlayout.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                swiperefreshlayout("1.0.0") {
                    implementation(Epit.swiperefreshlayout)
                    customVersionImplementation(Epit.swiperefreshlayout("1.1.2"))
                }
            }
        }
    }

}
