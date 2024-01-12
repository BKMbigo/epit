package dependencyhandler

import epit.dependencies.Koin
import epit.dependencyhandler.generateEpitDependencyHandler
import epit.utils.joinWithColon
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.junit.jupiter.api.Test

class EpitGradleDependencyHandlerTests {

    val koin_ktor = object : Dependency {
        override fun getGroup(): String = "io.ktor"

        override fun getName(): String = "ktor-ktor"

        override fun getVersion(): String? = "1.1.0"

        override fun contentEquals(dependency: Dependency): Boolean = false

        override fun copy(): Dependency = this

        override fun getReason(): String? = null

        override fun because(reason: String?) {}
    }

    @Test
    fun `EpitDependencyHandler fun implementation calls GradleDependencyHandler's implementation()`() {
        val gradleDependencyHandlerMock = mockk<DependencyHandler>()

        val koinDependency = Koin.koin_ktor.moduleName joinWithColon "1.1.0"
        val epitDependencyHandler = gradleDependencyHandlerMock.generateEpitDependencyHandler()

        every { gradleDependencyHandlerMock.add("implementation", koinDependency) } returns null

        epitDependencyHandler.implementation(koinDependency)

        verify(exactly = 1) { gradleDependencyHandlerMock.add("implementation", koinDependency) }
    }

    @Test
    fun `EpitDependencyHandler fun platform calls GradleDependencyHandler's platform()`() {
        val kotlinDependencyHandlerMock = mockk<DependencyHandler>()

        val koinDependency = Koin.koin_ktor.moduleName joinWithColon "1.1.0"
        val epitDependencyHandler = kotlinDependencyHandlerMock.generateEpitDependencyHandler()

        every { kotlinDependencyHandlerMock.platform(koinDependency) } returns koin_ktor

        epitDependencyHandler.platform(koinDependency)

        verify(exactly = 1) { kotlinDependencyHandlerMock.platform(koinDependency) }
    }


}
