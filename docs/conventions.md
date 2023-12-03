## ⚒️ epit Conventions

This is a guide on conventions used in the plugin

There are two methods you can use to define a dependency:

### i. epit dependencies

You can add dependencies as follows
> Note that with this option, you have to declare the specific version per dependencies as shown below:

```kotlin
dependencies {
    implementation(AndroidX.Appcompat.appcompat.withVersion("1.6.1"))
    implementation(AndroidX.Compose.Material3.Material3.material3.withVersion("1.1.2"))
}
```

> The dependencies naming scheme is influenced by the scheme below:

### ii. epit blocks

This are curated blocks that help you define dependencies in blocks, as defined in their group names

#### 1. add an `epitPreview` block

```kotlin
dependencies {
    epitPreview {
        /* Place your epit blocks here */
    }
}
```

### 2. add epit blocks until you find a dependecy block for the dependency you want

```kotlin 
dependencies {
    epitPreview {
        androidx {
            /* For androidx.appcompat */
            appcompat(/* version */) {

            }
            core {
                /* For androidx.core:core */
                core(/* version */) {

                }
            }
            test {
                ext {
                    /* For androidx.test.ext:junit*/
                    junit(/* version */) {

                    }
                }
            }
        }
        kotlinx {
            coroutines(/* version */) {

            }
        }
        koin(/* version */) {

        }
    }
}
```

Note there are two types of blocks:

##### 1. parent block (Do not require a version)

These are just containers for further descendants. You should not define a dependency inside a parent block!

```kotlin
dependencies {
    epitPreview {
        androidx {
            /* Child blocks are expected */
            core {
                /* Child blocks are expected */
            }
            test {
                /* Child blocks are expected */
            }
        }
        kotlinx {
            /* Child blocks are expected */
        }
        squareup {
            /* Child blocks are expected */
        }
    }
}
```

##### 2. dependencies block (You have to specify a version)

These are the blocks where you should add your dependencies. You have to explicitly set the version of the dependencies
or bom version

```kotlin
coroutines(/* version */) {
    /* You can now place your dependencies */
}
```

> **Note**   
> The blocks are meant to match the artifact's maven name, but in some instances, extra child blocks are made to
> accommodate artifacts with different versions as shown in the following case:
> ###### androidx.core
> The libraries under this group are as follows:
>   - `androidx:core:core:1.12.0`
>   - `androidx:core:core-animation:1.0.0-rc01`
>   - `androidx:core:core-animation-testing:1.0.0-rc01`
>   - `androidx:core:core-google-shortcuts:1.1.0`
>   - `androidx:core:core-i18n:1.0.0-alpha01`
>   - `androidx:core:core-ktx:1.12.0`
>   - `androidx:core:core-location-altitude:1.0.0-alpha01`
>   - `androidx:core:core-performance:1.0.0-beta02`
>   - `androidx:core:core-performance-play-services:1.0.0-beta02`
>   - `androidx:core:core-performance-testing:1.0.0-beta02`
>   - `androidx:core:core-remoteviews:1.0.0`
>   - `androidx:core:core-role:1.1.0-rc01`
>   - `androidx:core:core-splashcreen:1.1.0-alpha02` (Published on 9/6/2023)
>   - `androidx:core:core-telecom:1.1.0-alpha02` (Published on 10/04/2023)
>   - `androidx:core:core-testing:1.12.0`
> <details>
> <summary> These libraries cannot be placed in a single block, therefore, custom groups are added as follows:</summary>
>   - `core`
>     - `androidx:core:core` 
>     - `androidx:core:core-ktx` 
>     - `androidx:core:core-testing`
>   - `core-animation`
>     - `androidx:core:core-animation`
>     - `androidx:core:core-animation-testing`
>   - `core-location`
>     - `androidx:core:core-i18n`
>     - `androidx:core:core-location-altitude`
>   - `core-google-shortcuts`
>     - `androidx:core:core-google-shortcuts`
>   - `core-performance`
>     - `androidx:core:core-performance`
>     - `androidx:core:core-performance-play-services`
>     - `androidx:core:core-performance-testing`
>   - `core-splashscreen`
>     - `androidx:core:core-splashcreen`
>   - `core-telecom`
>     - `androidx.core:core-telecom`
> </details>  
>
> The groups are used to create the api used in the `core` section
>
> <details>
> <summary>As a result, the resulting block will look like:</summary>
> ```kotlin
>dependencies {
>    epitPreview {
>        androidx {
>           core {
>               core(/* Enter the version of androidx core: "1.12.0" */) {
>                   implementation(AndroidX.Core.Core.core)
>                   implementation(AndroidX.Core.Core.core_ktx)
>                   implementation(AndroidX.Core.Core.core_testing)
>               }
>               coreAnimation(/* Enter the version of androidx core animation: "1.0.0-rc01" */) {
>                   implementation(AndroidX.Core.CoreAnimation.core_animation)
>                   implementation(AndroidX.Core.CoreAnimation.core_animation_testing)
>               }
>               coreGoogleShortcuts(/* Enter the version of androidx core google shortcuts: "1.1.0" */) {
>                   implementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts)
>               }
>               coreLocation(/* Enter the version of androidx core location: "1.0.0-alpha01" */) {
>                   implementation(AndroidX.Core.CoreLocation.core_i18n)
>                   implementation(AndroidX.Core.CoreLocation.core_location_altitude)
>               }
>               corePerformance(/* Enter the version of androidx core performance: "1.0.0-beta02" */) {
>                   implementation(AndroidX.Core.CorePerformance.core_performance)
>                   implementation(AndroidX.Core.CorePerformance.core_performance_play_services)
>                   implementation(AndroidX.Core.CorePerformance.core_performance_testing)
>               }
>               coreRemoteViews(/* Enter the version of androidx core remote views: "1.0.0" */) {
>                   implementation(AndroidX.Core.CoreRemoteViews.core_remoteviews)
>               }
>               coreRole(/* Enter the version of androidx core role: "1.0.0" */) {
>                   implementation(AndroidX.Core.CoreRole.core_role)
>               }
>               coreSplashscreen(/* Enter the version of androidx core splashscreen: "1.0.1" */) {
>                   implementation(AndroidX.Core.CoreSplashscreen.core_splashscreen)
>               }
>               coreTelecom(/* Enter the version of androidx core telecom: "1.0.0-alpha02" */) {
>                   implementation(AndroidX.Core.CoreTelecom.core_telecom)
>               }
>           }
>        }
>    }
>}
>```
> </details>

> **Note**  
> You can use versions from your version catalogues as shown:
> ###### libs.versions.toml
> ```toml
> [versions]
> androidx-appcompat = "1.6.1"
> androidx-core = "1.12.0"
> androidx-core-splashscreen = "1.12.0"
> kotlinx-coroutines = "1.7.3"
>```
> ###### build.gradle.kts
> ```kotlin
> dependencies {
>   epitPreview {
>       androidx {
>           appcompat(libs.versions.androidx.appcompat.get()) { /* Dependencies */ }
>           core {
>               /* The following declaration does not have a get() method due to "androidx-core-splashscreen" version */
>               core(libs.versions.androidx.core.toString()) { /* Dependencies */ }
>           }
>       }
>       kotlinx {
>           coroutines(libs.versions.kotlinx.coroutines.get()) { /* Dependencies */ }
>       }
>   }
> }
>```

##### 3. add dependencies

You can now place your dependencies inside the block

```kotlin
dependencies {
    epitPreview {
        kotlinx {
            coroutines("1.7.3") {
                implementation(KotlinX.Coroutines.coroutines_core)
                implementation(KotlinX.Coroutines.coroutines_rxjava2)
              testImplementation(KotlinX.Coroutines.coroutines_test.dependencyAsString)
              androidTestImplementation(KotlinX.Coroutines.coroutines_test.dependencyAsString("1.5.1"))
            }
        }
    }
}
```

The above block adds:

- `org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3` and `org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3` in
  the `implementation` configuration
- `org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3` in the `testImplementation` configuration
- `org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1` in the `testImplementation` configuration

The name of the dependencies, are mostly similar to the path taken to reach the block, for example:

```kotlin
dependencies {
    epitPreview {
        androidx {
            composeAnimation(/* version */) {
                /* dependencies will be under: AndroidX.Compose.ComposeAnimation. */
            }
            core {
                core(/* version */) {
                    /* dependencies will be under: AndroidX.Core.Core. */
                }
            }
            test {
                espresso(/* version */) {
                    /* dependencies will be under: AndroidX.Test.Espresso. */
                }
                ext {
                    junit(/* version */) {
                        /* dependencies will be under: AndroidX.Test.Ext.JUnit. */
                    }
                }
            }
        }
        kotlinx {
            coroutines(/* version */) {
                /* dependencies will be under: KotlinX.Coroutines. */
            }
        }
        koin(/* BOM version */) {
            /* dependencies will be under: Koin. */
        }
    }
}
```

> **Note**  
> The plugin cannot guarantee the configurations present in your module, therefore, only `implementation` is implemented
> in the plugin  
> When declaring dependencies in the `implementation` configuration, you don't have to use  `.dependencyAsString` at the
> end of
> your declaration:
> ```kotlin
> ...
> coroutines("1.7.3") {
>   implementation(KotlinX.Coroutines.coroutines_core)
> }
> ...
>```   
> However, in all other configurations, you have to explicitly call `.dependencyAsString` at the end of your dependency
> declaration
> ```kotlin
> ...
> coroutines("1.7.3") {
>   debugImplementation(KotlinX.Coroutines.coroutines_rxjava2.dependencyAsString)
>   releaseImplementation(KotlinX.Coroutines.coroutines_rxjava3.dependencyAsString)
> }
> ...
> androidx {
>   room("2.6.2") {
>       ksp(AndroidX.Room.room_compiler.dependencyAsString)
>   }
> }
> ...
>```
> You can also call a different version of a dependency by calling `.dependencyAsString(/* version */)` on the
> dependency
> ```kotlin
> coroutines("1.7.3") {
>   implementation(KotlinX.Coroutines.coroutines_core)
>   implementation(KotlinX.Coroutines.coroutines_rxjava2.dependencyAsString("1.6.4")) /* This will pull in version "1.6.4" of this library */
> }
>```
> If your dependencies block is based on a BOM(bill of materials), you can call `bom` to get the bom and use it as
> follows:
> ```kotlin
> androidx {
>   compose("2023.10.01") {
>       implementation(AndroidX.Compose.Runtime.Runtime.runtime)
> 
>       androidTestImplementation(bom)
>       /* You can also use */
>       androidTestImplementation(platform(bomAsString))
>       androidTestImplementation(AndroidX.Compose.UI.ui_test_junit4)
>
>       testImplementation(bom("2023.09.00")) /* Loads a different BOM version */
>       /* You can also use */
>       testImplementation(platform(bomAsString("2023.09.00"))) /* Loads a different BOM version */
>       testImplementation(AndroidX.Compose.UI.ui_test_junit4)
>   }
> }
>```

### Versioning

The plugin versions are determined on a time-based manner. Version `2023.12.00-beta` is a 2023-December version.
The `00` is the first version of the month.
