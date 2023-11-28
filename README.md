# EPIT

epit introduces type-safe kotlin dependencies in your build.gradle.kts scripts. With epit, the IDE can help you define your dependencies as you create your project

Please note that the plugin is currently experimental
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
```Kotlin
dependencies {
  @OptIn(ExperimentalEpitApi::class)
  epitPreview {
    androidx {
      core {
        core("1.12.0") {
          implementation(AndroidX.Core.core)
          implementation(AndroidX.Core.core_ktx)
        }
      }
      camera("1.3.0") {
        implementation(AndroidX.Camera.camera_lifecycle)
        implementation(AndroidX.Camera.camera_extensions)
        implementation(AndroidX.Camera.camera_core)
        implementation(AndroidX.Camera.camera_view)
        implementation(AndroidX.Camera.camera_camera2)
        implementation(AndroidX.Camera.camera_video)
      }
    }
    compose("2023.10.01") {
      implementation(Compose.ComposeRuntime.runtime)
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

- androidx
  - activity
  - appcompat
  - camera
  - composeAnimation
  - composeCompiler
  - composeFoundation
  - composeMaterial
  - composeMaterial3
  - composeRuntime
  - composeUI
  - constraintlayout
  - core
  - fragment
  - lifecycle
  - navigation
  - recyclerview
  - room
  - test
  - espresso
- kotlinx
  - atomicfu
  - coroutines
  - collections-immutable
  - datetime
  - serialization
- squareup
  - leakcanary
  - okhttp3
  - picasso
  - retrofit2
- firebase
- koin
