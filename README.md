# EPIT

epit introduces type-safe kotlin dependencies in your build.gradle.kts scripts. With epit, the IDE can help you define your dependencies as you create your project

###### Without epit
```Kotlin
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.camera:camera-lifecycle:1.3.0")
    implementation("androidx.camera:camera-extensions:1.3.0")
    implementation("androidx.camera:camera-core:1.3.0")
    implementation("androidx.camera:camera-view:1.3.0")
    implementation("androidx.camera:camera-camera2:1.3.0")
    implementation("androidx.camera:camera-video:1.3.0")
}
```

###### with epit
```Kotlin
dependencies {
    androidx {
        core("1.12.0") {
            implementation(Core.core_ktx)
        }
        camera("1.3.0") {
            implementation(Camera.camera_lifecycle)
            implementation(Camera.camera_extensions)
            implementation(Camera.camera_core)
            implementation(Camera.camera_view)
            implementation(Camera.camera_camera2)
            implementation(Camera.camera_video)
        }
    }
}
```
