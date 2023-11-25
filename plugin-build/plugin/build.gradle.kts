import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin)
    `kotlin-dsl`
}

group = "com.github.bkmbigo.epit"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.freeCompilerArgs += "-Xcontext-receivers"
}

tasks.test {
    useJUnitPlatform()
}

gradlePlugin {
    plugins {
        create("com.github.bkmbigo.epit") {
            id = "com.github.bkmbigo.epit"
            implementationClass = "EpitPlugin"
            version = "0.0.0-beta.1"
            displayName = "Epit"
        }
    }

    website.set("https://www.github.com/bkmbigo/epit")
    vcsUrl.set("https://www.github.com/bkmbigo/epit")
}
