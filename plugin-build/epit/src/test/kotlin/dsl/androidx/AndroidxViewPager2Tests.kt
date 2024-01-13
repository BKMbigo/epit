package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxViewPager2Tests {

    @Test
    fun `verify that androidx viewPager2 block implementation adds dependencies`() = testEpitDsl(
        "androidx viewPager2",
        expectedModuleNames = listOf(
            AndroidX.ViewPager2.viewpager2.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                viewpager2("1.0.0") {
                    implementation(Epit.viewpager2)
                    customVersionImplementation(Epit.viewpager2("1.1.2"))
                }
            }
        }
    }

}
