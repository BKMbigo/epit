import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
    alias(libs.plugins.gradlePluginPublish)
}

group = "io.github.bkmbigo.epit"
version = "2024.01.00-beta"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.withType<KotlinCompile> {
    /* Opt-in to content receivers */
    kotlinOptions.freeCompilerArgs += "-Xcontext-receivers"
}

tasks.named<KotlinCompilationTask<*>>("compileKotlin").configure {
    compilerOptions.freeCompilerArgs.addAll(
        listOf(
            "-opt-in=epit.annotations.InternalEpitApi",
            "-opt-in=epit.annotations.ExperimentalEpitApi"
        )
    )
}

tasks.test {
    useJUnitPlatform()
}

gradlePlugin {
    plugins {
        create("io.github.bkmbigo.epit") {
            id = "io.github.bkmbigo.epit"
            implementationClass = "EpitPlugin"
            version = "2024.01.00-beta"
            displayName = "Epit"
            description = "The Plugins adds type-safe dependency declarations to your kotlin build scripts"
            tags.set(listOf("dependencies", "android", "kotlin"))
        }
    }

    website.set("https://www.github.com/bkmbigo/epit")
    vcsUrl.set("https://www.github.com/bkmbigo/epit")
}
