## ⚒️ epit

epit introduces type-safe kotlin dependencies in your build.gradle.kts scripts. With epit, the IDE can help you define
your dependencies as you create your project

with epit, you can define your dependencies as shown below:

```kotlin
dependencies {
    epitPreview {
        androidx {
            core {
                core("1.12.0") {
                    implementation(Epit.core_ktx)
                }
            }
            navigation("2.7.5") {
                implementation(Epit.navigation_compose)
            }
        }
        kotlinx {
            coroutines("1.7.3") {
                implementation(Epit.coroutines_core)
                testImplementation(Epit.coroutines_testing)
            }
        }
        koin("3.5.1") {
            implementation(Epit.koin_core)
            implementation(Epit.koin_android)
        }
    }
}
```

## ⚒️ Work In Progress

> **NOTE**   
> The plugin is very experimental. For now, I have not fully committed to developing the plugin, and I only use it for
> hobby projects.  
> Feel free to try it in your projects, create issues and pull requests.

## How to use

The current version is `2024.01.00-preview`

> Please note that this plugin:
>    - Only works on `gradle.kts` scripts
>    - Currently, only supports a limited number of [libraries](docs/libraries_supported.md)

To use the plugin in your projects, add the following in your project's `build.gradle.kts`

```kotlin
plugins {
    id("io.github.bkmbigo.epit") version "2024.01.00-preview" apply false
}
```

That's it!!  
You can now use the plugin in your scripts as you wish

Make sure to read the [conventions](docs/conventions.md) and [libraries supported](docs/libraries_supported.md)
