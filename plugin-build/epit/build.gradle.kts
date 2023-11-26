import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
}

group = "io.github.bkmbigo.epit"
version = "unspecified"

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

tasks.test {
    useJUnitPlatform()
}

gradlePlugin {
    plugins {
        create("io.github.bkmbigo.epit") {
            id = "io.github.bkmbigo.epit"
            implementationClass = "EpitPlugin"
            version = "0.0.0-beta.1"
            displayName = "Epit"
            description = "The Plugins adds type-safe dependency declarations to your kotlin build scripts"
            tags.set(listOf("dependencies", "android", "kotlin"))
        }
    }

    website.set("https://www.github.com/bkmbigo/epit")
    vcsUrl.set("https://www.github.com/bkmbigo/epit")
}
