import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class EpitPluginTest {
    @Test
    fun `plugin is applied to the project`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        assert(project.plugins.hasPlugin("io.github.bkmbigo.epit"))
    }

    @Test
    fun `plugin extension is available in the project`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        assertDoesNotThrow { project.extensions.getByName("epit") }
    }

}
