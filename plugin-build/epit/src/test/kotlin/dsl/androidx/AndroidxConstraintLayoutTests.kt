package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxConstraintLayoutTests {

    @Test
    fun `verify that androidx constraint layout block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                constraintLayout {
                    constraintlayout("1.0.0") {
                        implementation(Epit.constraintlayout)
                        customVersionImplementation(Epit.constraintlayout("1.1.2"))
                    }
                    constraintlayoutCompose("1.0.0") {
                        implementation(Epit.constraintlayout_compose)
                        customVersionImplementation(Epit.constraintlayout_compose("1.1.2"))
                    }
                    constraintlayoutCore("1.0.0") {
                        implementation(Epit.constraintlayout_core)
                        customVersionImplementation(Epit.constraintlayout_core("1.1.2"))
                    }
                    constraintlayoutSolver("1.0.0") {
                        implementation(Epit.constraintlayout_solver)
                        customVersionImplementation(Epit.constraintlayout_solver("1.1.2"))
                    }
                }
            }
        }
    }

}
