package dependencyhandler

import epit.dependencyhandler.generateEpitDependencyHandler
import epit.dsl.koin.Koin
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.gradle.api.artifacts.Dependency
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
import org.junit.jupiter.api.Test

class EpitKotlinDependencyHandlerTests {

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
    fun `EpitDependencyHandler fun implementation calls KotlinDependencyHandler's implementation()`() {
        val kotlinDependencyHandlerMock = mockk<KotlinDependencyHandler>()

        val koinDependency = Koin.koin_ktor.withVersion("1.1.0")
        val epitDependencyHandler = kotlinDependencyHandlerMock.generateEpitDependencyHandler()

        every { kotlinDependencyHandlerMock.implementation(koinDependency) } returns null

        epitDependencyHandler.implementation(koinDependency)

        verify(exactly = 1) { kotlinDependencyHandlerMock.implementation(koinDependency) }
    }

    @Test
    fun `EpitDependencyHandler fun platform calls KotlinDependencyHandler's platform()`() {
        val kotlinDependencyHandlerMock = mockk<KotlinDependencyHandler>()

        val koinDependency = Koin.koin_ktor.withVersion("1.1.0")
        val epitDependencyHandler = kotlinDependencyHandlerMock.generateEpitDependencyHandler()

        every { kotlinDependencyHandlerMock.project.dependencies.platform(koinDependency) } returns koin_ktor

        epitDependencyHandler.platform(koinDependency)

        verify(exactly = 1) { kotlinDependencyHandlerMock.project.dependencies.platform(koinDependency) }
    }

}
