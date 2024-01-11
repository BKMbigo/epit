## ⚒️ epit Conventions

This is a guide on conventions used in the plugin

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
          /* For org.jetbrains.kotlinx:kotlinx-coroutines */
            coroutines(/* version */) {

            }
        }
      /* For "io.ktor:" */
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
>                   implementation(Epit.Core.core)
>                   implementation(Epit.core_ktx)
>                   implementation(Epit.core_testing)
>               }
>               coreAnimation(/* Enter the version of androidx core animation: "1.0.0-rc01" */) {
>                   implementation(Epit.core_animation)
>                   implementation(Epit.core_animation_testing)
>               }
>               coreGoogleShortcuts(/* Enter the version of androidx core google shortcuts: "1.1.0" */) {
>                   implementation(Epit.core_google_shortcuts)
>               }
>               coreLocation(/* Enter the version of androidx core location: "1.0.0-alpha01" */) {
>                   implementation(Epit.core_i18n)
>                   implementation(Epit.core_location_altitude)
>               }
>               corePerformance(/* Enter the version of androidx core performance: "1.0.0-beta02" */) {
>                   implementation(Epit.core_performance)
>                   implementation(Epit.core_performance_play_services)
>                   implementation(Epit.core_performance_testing)
>               }
>               coreRemoteViews(/* Enter the version of androidx core remote views: "1.0.0" */) {
>                   implementation(Epit.core_remoteviews)
>               }
>               coreRole(/* Enter the version of androidx core role: "1.0.0" */) {
>                   implementation(Epit.core_role)
>               }
>               coreSplashscreen(/* Enter the version of androidx core splashscreen: "1.0.1" */) {
>                   implementation(Epit.core_splashscreen)
>               }
>               coreTelecom(/* Enter the version of androidx core telecom: "1.0.0-alpha02" */) {
>                   implementation(Epit.core_telecom)
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
>               /* The following declaration does not have a get() method due to the conflicting "androidx-core-splashscreen" version */
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
              implementation(Epit.coroutines_core)
              implementation(Epit.coroutines_rxjava2)
              testImplementation(Epit.coroutines_test)
              androidTestImplementation(Epit.coroutines_test("1.5.1"))
            }
        }
    }
}
```

You can specify to include a separate version by using the function equivalent

The above block adds:

- `org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3` and `org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3` in
  the `implementation` configuration
- `org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3` in the `testImplementation` configuration
- `org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1` in the `androidTestImplementation` configuration

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

### BOM convention

if the library includes a bom, the block will be named with a `-bom`suffix (for
example: `ktorBom`, `composeBom`, `firebaseBom`). Upon adding the block, the plugin will add the bom as a dependency in
the `implementation` configuration.

```kotlin
dependencies {
  epitPreview {
    koinBom(/* The version of koin you would like: 3.5.1*/) {
      // This will automatically add implementation(platform("io.insert-koin:koin-bom:3.5.1"))

      implementation(Epit.koin_core)
    }
  }
}
```

if you want to use the bom in another configuration (other than `implementation` for example, `testImplementation`
or `androidTestImplementation`), you can use the property `bom` as follows:

```kotlin
dependencies {
  epitPreview {
    koinBom(/* The version of koin you would like: 3.5.1*/) {
      testImplementation(bom)
      testImplementation(Epit.koin_test)

      androidTestImplementation(bom("3.5.0")) /* If you want to use a different version */
      androidTestImplementation(Epit.koin_android_test)
    }
  }
}
```

### Versioning

The plugin versions are determined on a time-based manner. Version `2023.12.00-beta` is a 2023-December version.
The `00` is the first version of the month.
