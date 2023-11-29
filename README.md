## ⚒️ epit

epit introduces type-safe kotlin dependencies in your build.gradle.kts scripts. With epit, the IDE can help you define
your dependencies as you create your project

> **Note**  
> Please note that the plugin is currently experimental and the API's may change in-between updates without warning

###### Without epit

```Kotlin
dependencies {
    implementation("androidx.core:core:1.12.0")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.camera:camera-lifecycle:1.3.0")
    implementation("androidx.camera:camera-extensions:1.3.0")
    implementation("androidx.camera:camera-core:1.3.0")
    implementation("androidx.camera:camera-view:1.3.0")
    implementation("androidx.camera:camera-camera2:1.3.0")
    implementation("androidx.camera:camera-video:1.3.0")
    implementation("androidx.compose:compose-bom:2023.10.01")
    implementation("androidx.compose.runtime:runtime")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}
```

###### with epit

Epit introduces type-safe dependencies inside your build.gradle.kts scripts.

Go to your project level `build.gradle.kts` and import epit

```kotlin
plugins {
    id("io.github.bkmbigo.epit") version "0.0.0-beta.3" apply false
}
```

Now proceed to your module's `build.gradle.kts` and apply the plugin

```kotlin
plugins {
    id("io.github.bkmbigo.epit")
}
```

Sync your project and then head to the dependencies block of your module and use epit as shown below:

```Kotlin
dependencies {
    @OptIn(ExperimentalEpitApi::class)
    epitPreview {
        androidx {
            camera("1.3.0") {
                implementation(AndroidX.Camera.camera_lifecycle)
                implementation(AndroidX.Camera.camera_extensions)
                implementation(AndroidX.Camera.camera_core)
                implementation(AndroidX.Camera.camera_view)
                implementation(AndroidX.Camera.camera_camera2)
                implementation(AndroidX.Camera.camera_video)
            }
            compose("2023.10.01") {
                implementation(Compose.ComposeRuntime.runtime)
            }
            core {
                core("1.12.0") {
                    implementation(AndroidX.Core.core)
                    implementation(AndroidX.Core.core_ktx)
                }
            }
        }
        kotlinx {
            coroutines("1.7.3") {
                implementation(KotlinX.Coroutines.coroutines_core)
            }
        }
    }
}
```

## Libraries supported

Libraries supported are listed [separately](docs/libraries_supported.md)
