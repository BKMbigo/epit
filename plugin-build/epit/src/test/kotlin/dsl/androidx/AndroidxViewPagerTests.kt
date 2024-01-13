package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxViewPagerTests {

    @Test
    fun `verify that androidx viewPager block implementation adds dependencies`() = testEpitDsl(
        "androidx viewPager",
        expectedModuleNames = listOf(
            AndroidX.ViewPager.viewpager.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                viewpager("1.0.0") {
                    implementation(Epit.viewpager)
                    customVersionImplementation(Epit.viewpager("1.1.2"))
                }
            }
        }
    }

}
