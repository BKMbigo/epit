## Libraries Supported
epit aims to provide a rich library of kotlin and android dependencies in the long run. However, currently the library only supports a select-few dependencies as listed below

### Table of contents
- [AndroidX libraries](#androidx-libraries)
- [KotlinX libraries](#kotlinx-libraries)
- [Koin](#koin)
- [Voyager](#voyager)
- [Coil](#coil)
- [Glide](#glide)
- [Raamcosta](#raamcosta)
    - [Compose Destinations](#compose-destinations)
- [Google](#google)
  - [Accompanist](#accompanist)
  - [Firebase](#firebase)
- [Ktor](#ktor)

### AndroidX Libraries
This are android-specific libraries 
###### Table of contents
  - [activity](#androidx-activity)
  - [appcompat](#androidx-appcompat)
  - [camera](#androidx-camera)
- [compose](#androidx-compose)
    - [composeAnimation](#androidx-compose-animation)
    - [composeCompiler](#androidx-compose-compiler)
    - [composeFoundation](#androidx-compose-foundation)
    - [composeMaterial](#androidx-compose-material)
    - [composeMaterial3](#androidx-compose-material-3)
    - [composeRuntime](#androidx-compose-runtime)
    - [composeUI](#androidx-compose-ui)
  - [constraintlayout](#androidx-constraintlayout)
  - [core](#androidx-core)
  - [fragment](#androidx-fragment)
  - [lifecycle](#androidx-lifecycle)
  - [navigation](#androidx-navigation)
  - [recyclerview](#androidx-recyclerview)
  - [room](#androidx-room)
  - [test](#androidx-test)
  - [espresso](#androidx-test-espresso)
  - [test ext](#androidx-test-ext)

##### Androidx Activity

```kotlin
dependencies {
    epitPreview {
        androidx {
            activity(/* Place the version of activity library you want: "1.8.1" */) {
                implementation(AndroidX.Activity.activity)
                implementation(AndroidX.Activity.activity_compose)
                implementation(AndroidX.Activity.activity_ktx)
            }
        }
    }
}
```

##### Androidx AppCompat

```kotlin
dependencies {
    epitPreview {
        androidx {
            appcompat(/* Place the version of appcompat library you want: "1.6.1" */) {
              implementation(Epit.appcompat)
              implementation(Epit.appcompat_resources)
            }
        }
    }
}
```

##### Androidx Camera

```kotlin
dependencies {
    epitPreview {
        androidx {
            camera(/* Place the version of camera library you want: "1.3.0" */) {
              implementation(Epit.camera_lifecycle)
              implementation(Epit.camera_extensions)
              implementation(Epit.camera_core)
              implementation(Epit.camera_view)
              implementation(Epit.camera_camera2)
              implementation(Epit.camera_video)
            }
        }
    }
}
```

##### Androidx Compose

For compose, you can either opt to use the bill of materials, or add individual libraries separately.  
If you choose to use the bom, add the libraries as follows:

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
              composeBom(/* Enter the version of compose-bom: "2023.10.01" */) {
                implementation(Epit.animation)
                implementation(Epit.runtime)
                }
            }
        }
    }
}
```

> **Note**  
> The following libraries are not currently bundled in the bom:
>   - `androidx.compose.foundation:foundation-text`
>   - `androidx.compose.material3:material3-adaptive`
>   - `androidx.compose.material3:material3-adaptive-navigation-suite`
>   - `androidx.compose.runtime:runtime-tracing`

##### Androidx Compose Animation

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                animation(/* Place the version of compose.animation library you want: "1.5.4" */) {
                  implementation(Epit.animation)
                  implementation(Epit.animation_core)
                  implementation(Epit.animation_graphics)
                  implementation(Epit.animation_tooling_internal)
                }
            }
        }
    }
}
```

##### Androidx Compose Compiler

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                compiler(/* Place the version of compose.compiler library you want: "1.5.4" */) {
                  implementation(Epit.compiler)
                  implementation(Epit.compiler_daemon)
                  implementation(Epit.compiler_hosted)
                }
            }
        }
    }
}
```

##### Androidx Compose Foundation

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                foundation {
                    foundation(/* Place the version of compose.foundation library you want: "1.5.4" */) {
                      implementation(Epit.foundation)
                      implementation(Epit.foundation_layout)
                    }
                }
            }
        }
    }
}
```

> **Note**  
> The library `androidx.compose.foundation:foundation-text` follows a different versioning scheme, therefore cannot be included in the above block  
> To use the library:
> ```kotlin
>   dependencies {
>       epitPreview {
>           androidx {
>               compose {
>                   foundation {
>                       foundationText(/* Place the version of compose.foundation_text library you want: "1.0.0-alpha07" */) {
>                           implementation(Epit.foundation_text)
>                       }
>                   }
>               }
>           }
>       }
>   }
>```
> 

##### Androidx Compose Material

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                material(/* Place the version of compose.material library you want: "1.5.4" */) {
                  implementation(Epit.material)
                  implementation(Epit.material_icons_core)
                  implementation(Epit.material_icons_extended)
                  implementation(Epit.material_ripple)
                }
            }
        }
    }
}
```

##### Androidx Compose Material 3

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                material3 {
                    material3(/* Place the version of compose.material3 library you want: "1.1.2" */) {
                      implementation(Epit.material3)
                      implementation(Epit.material3_window_size_class)
                    }
                }
            }
        }
    }
}
```
> **Note**  
> Compose Material3 group has a couple of libraries that differ in versioning systems, they include
>   - `androidx.compose.material3:material3-adaptive`
>   - `androidx.compose.material3:material3-adaptive-navigation-suite`  
> 
> The above libraries are included in a different namespace as shown below:
> ```kotlin
>   dependencies {
>        epitPreview {
>            androidx {
>                compose {
>                   material3 {
>                       material3Adaptive(/* Place the version of compose.material3 library you want: "1.0.0-alpha01" */) {
>                           implementation(Epit.material3_adaptive)
>                           implementation(Epit.material3_adaptive_navigation_suite)
>                       }
>                   }
>               }
>            }
>        }
>   }
> ```

##### Androidx Compose Runtime

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                runtime {
                    runtime(/* Place the version of compose.runtime library you want: "1.5.4" */) {
                      implementation(Epit.runtime)
                      implementation(Epit.runtime_livedata)
                      implementation(Epit.runtime_rxjava2)
                      implementation(Epit.runtime_rxjava3)
                      implementation(Epit.runtime_saveable)
                    }
                }
            }
        }
    }
}
```
> **Note**  
> The following libraries are not included in the group:  
> - `androidx.compose.runtime:runtime-dispatch`  
> - `androidx.compose.runtime:runtime-saved-instance-state`  
>   
> Additionally, the library `androidx.compose.runtime:runtime-tracing` follows a different version scheme and cannot be included in the block. To include the library:
> ```kotlin
>   dependencies {
>        epitPreview {
>            androidx {
>               compose {
>                   runtime {
>                       runtimeTracing(/* Place the version of compose.runtime_tracing library you want: "1.0.0-alpha05" */) {
>                           implementation(Epit.runtime_tracing)
>                       }
>                   }
>               }
>            }
>        }
>   }
>```
> 

##### Androidx Compose UI

If you want to use compose bill of materials, please refer to the compose [section](#androidx-compose)

```kotlin
dependencies {
    epitPreview {
        androidx {
            compose {
                ui(/* Place the version of compose.ui library you want: "1.5.4" */) {
                    implementation(Epit.ui)
                    implementation(Epit.ui_android_stubs)
                    implementation(Epit.ui_geometry)
                    implementation(Epit.ui_graphics)
                    ...
                }
            }
        }
    }
}
```

##### Androidx ConstraintLayout
Constraint Layout contains different libraries with varying versions, therefore, it has been turned into a block:

```kotlin
dependencies {
    epitPreview {
        androidx {
           constraintLayout {
               constraintLayout(/* Enter the version of constraint layout: "2.1.4" */) {
                   implementation(Epit.constraintlayout)
               }
               constraintLayoutCompose(/* Enter the version of constraint layout compose: "" */) {
                   implementation(Epit.constraintlayout_compose)
               }
               constraintLayoutCore(/* Enter the version of constraint layout core: "1.0.4" */) {
                   implementation(Epit.constraintlayout_core)
               }
               constriaintLayoutSolver(/* Enter the version of constraint layout solver: "2.0.4" */) {
                   implementation(Epit.constraintlayout_solver)
               }
           }
        }
    }
}
```

##### Androidx Core
AndroidX Core contains different libraries with varying versions, therefore, it has been turned into a block:

```kotlin
dependencies {
    epitPreview {
        androidx {
           core {
               core(/* Enter the version of androidx core: "1.12.0" */) {
                 implementation(Epit.core)
                 implementation(Epit.core_ktx)
                 implementation(Epit.core_testing)
               }
               coreAnimation(/* Enter the version of androidx core animation: "1.0.0-rc01" */) {
                 implementation(Epit.core_animation)
                 implementation(Epit.core_animation_testing)
               }
               coreGoogleShortcuts(/* Enter the version of androidx core google shortcuts: "1.1.0" */) {
                 implementation(Epit.core_google_shortcuts)
               }
               coreLocation(/* Enter the version of androidx core location: "1.0.0-alpha01" */) {
                 implementation(Epit.core_i18n)
                 implementation(Epit.core_location_altitude)
               }
               corePerformance(/* Enter the version of androidx core performance: "1.0.0-beta02" */) {
                 implementation(Epit.core_performance)
                 implementation(Epit.core_performance_play_services)
                 implementation(Epit.core_performance_testing)
               }
               coreRemoteViews(/* Enter the version of androidx core remote views: "1.0.0" */) {
                 implementation(Epit.core_remoteviews)
               }
               coreRole(/* Enter the version of androidx core role: "1.0.0" */) {
                 implementation(Epit.core_role)
               }
               coreSplashscreen(/* Enter the version of androidx core splashscreen: "1.0.1" */) {
                 implementation(Epit.core_splashscreen)
               }
               coreTelecom(/* Enter the version of androidx core telecom: "1.0.0-alpha02" */) {
                 implementation(Epit.core_telecom)
               }
           }
        }
    }
}
```

##### Androidx Fragment

```kotlin
dependencies {
    epitPreview {
        androidx {
            fragment(/* Place the version of fragment library you want: "1.6.2" */) {
              implementation(Epit.fragment)
              implementation(Epit.fragment_ktx)
              implementation(Epit.fragment_testing)
              implementation(Epit.fragment_test_manifest)
            }
        }
    }
}
```

##### Androidx Lifecycle

```kotlin
dependencies {
    epitPreview {
        androidx {
            lifecycle(/* Place the version of androidx lifecycle library you want: "2.6.2" */) {
              implementation(Epit.lifecycle_common)
                ...
            }
        }
    }
}
```

> **Note**  
> The library `androidx.lifecycle:lifecycle-extensions` is included

##### Androidx Navigation

```kotlin
dependencies {
    epitPreview {
        androidx {
            navigation(/* Place the version of androidx navigation library you want: "2.7.5" */) {
              implementation(Epit.navigation_common)
                ...
            }
        }
    }
}
```

##### Androidx Paging

```kotlin
dependencies {
    epitPreview {
        androidx {
            paging(/* Place the version of androidx paging library you want: "3.2.1" */) {
              implementation(Epit.paging_common)
                ...
            }
        }
    }
}
```

##### Androidx RecyclerView

```kotlin
dependencies {
    epitPreview {
        androidx {
            paging(/* Place the version of androidx recyclerview library you want: "3.2.1" */) {
              implementation(Epit.recyclerview)
                ...
            }
        }
    }
}
```

##### Androidx Room

```kotlin
dependencies {
    epitPreview {
        androidx {
            room(/* Place the version of androidx room library you want: "2.6.0" */) {
              implementation(Epit.room_runtime)
                ...
            }
        }
    }
}
```
> **Note**  
> The library `androidx.room:room-coroutines` is not available in the above block
##### Androidx Test
Different libraries under `androidx.test` have different versions, therefore cannot be grouped together

```kotlin
dependencies {
    epitPreview {
        androidx {
            test {
                annotation(/* Enter the version of androidx.test:annotation "1.0.1" */) {
                  implementation(Epit.test_annotation)
                }
                core(/* Enter the version of androidx.test:core "1.5.0" */) {
                  implementation(Epit.core)
                  implementation(Epit.core_ktx)
                }
                monitor(/* Enter the version of androidx.test:monitor "1.6.1" */) {
                  implementation(Epit.monitor)
                }
                orchestrator(/* Enter the version of androidx.test:orchestrator "1.4.2" */) {
                  implementation(Epit.orchestrator)
                }
                rules(/* Enter the version of androidx.test:rules "1.4.2" */) {
                  implementation(Epit.rules)
                }
                runner(/* Enter the version of androidx.test:runner "1.5.2" */) {
                  implementation(Epit.runner)
                }
            }
        }
    }
}
```

##### Androidx Test Espresso

```kotlin
dependencies {
    epitPreview {
        androidx {
            test {
                espresso {
                    espresso(/* Enter the version of androidx.test.espresso: "3.5.1" */) {
                      implementation(Epit.espresso_accessibility)
                      implementation(Epit.espresso_contrib)
                      implementation(Epit.espresso_core)
                      implementation(Epit.espresso_idling_resource)
                      implementation(Epit.espresso_intents)
                      implementation(Epit.espresso_remote)
                      implementation(Epit.espresso_web)

                        /* You can also include libraries under the group androidx.test.espresso.idling */
                      implementation(Epit.idling_concurrent)
                      implementation(Epit.idling_net)
                    }

                    /* Alternatively, you can declare them in a serparate block */
                    idling(/* Enter the version of androidx.test.espresso.idling: "3.5.1" */) {
                      implementation(Epit.idling_concurrent)
                      implementation(Epit.idling_net)
                    }
                }
            }
        }
    }
}
```

> **Note**  
> The library `androidx.test.espresso:espresso-device` has varying versions, therefore cannot be included in the above block
> ```kotlin
>dependencies {
>    epitPreview {
>        androidx {
>            test {
>               espresso{
>                   espressoDevice(/* Enter the version of androidx.test.espresso:espresso-device: "1.0.0-alpha06" */) {
>                       implementation(Epit.espresso_device)
>                   }
>               }
>            }
>        }
>    }
>}
>```

##### Androidx Test Ext
Different libraries under `androidx.test.ext` have different versions, therefore cannot be grouped together

```kotlin
dependencies {
    epitPreview {
        androidx {
            test {
                ext {
                    jUnit(/* Enter the version of androidx.test.ext:junit "1.1.5"  */) {
                      implementation(Epit.junit)
                      implementation(Epit.junit_ktx)
                    }
                    jUnitGTest(/* Enter the version of androidx.test.ext:junit-gtest "1.0.0-alpha02"  */) {
                      implementation(Epit.junit_gtest)
                    }
                    truth(/* Enter the version of androidx.test.ext:truth "1.5.0" */) {
                      implementation(Epit.truth)
                    }
                }
            }
        }
    }
}
```

### KotlinX Libraries

```kotlin
dependencies {
    epitPreview {
        kotlinx {
            atomicfu(/* Place the version of kotlinx.atomicfu library you want: "0.23.0" */) {
              implementation(Epit.atomicfu)
            }
            collectionsImmutable(/* Place the version of kotlinx.collections-immutable library you want: "0.3.6" */) {
              implementation(Epit.collections_immutable)
            }
            coroutines(/* Place the version of kotlinx.coroutines library you want: "1.7.3" */) {
              implementation(Epit.coroutines_core)
                ...
            }
            datetime(/* Place the version of kotlinx.datetime library you want: "0.4.1" */) {
              implementation(Epit.datetime)
            }
            serialization(/* Place the version of kotlinx.serialization library you want: "1.6.1" */) {
              implementation(Epit.serialization_core)
              implementation(Epit.serialization_json)
            }
        }
    }
}
```

### Koin

```kotlin
dependencies {
    epitPreview {
      koinBom(/* Enter the version of koin bom you would like: "3.5.2-RC1" */) {
        implementation(Epit.koin_core)
            ..
        }
    }
}
```

### Voyager

```kotlin
dependencies {
    epitPreview {
        voyager(/* Enter the version of voyager you would like: "1.0.0-rc10" */) {
          implementation(Epit.voyager_navigator)
            ..
        }
    }
}
```

### Coil

```kotlin
dependencies {
    epitPreview {
      coilBom(/* Enter the version of coil bom you would like: "1.0.0-rc10" */) {
        implementation(Epit.coil)
            ..
        }
    }
}
```

### Glide

Glide libraries are divided into `Glide` and  `GlideKtx`, where `GlideKtx` contains `com.github.bumptech.glide:compose`
and `com.github.bumptech.glide:ktx`
```kotlin
dependencies {
    epitPreview {
        glide {
            glide(/* Enter the version of glide bom you would like: "5.0.0-rc01" */) {
              implementation(Epit.glide)
                ..
            }
            glideKtx(/* Enter the version of glide compose/ktx you want: "1.0.0-beta01" */) {
              implementation(Epit.glide_ktx)
              implementation(Epit.glide_compose)
            }
        }
    }
}
```

### Raamcosta

#### Compose Destinations

```kotlin
dependencies {
    epitPreview {
        raamcosta {
            composeDestinations(/* Enter the version of compose destinations you want: "" */) {
              implementation(Epit.core)
              ksp(Epit.ksp)
                ...
            }
        }
    }
}
```

### Google

#### Accompanist

```kotlin
dependencies {
    epitPreview {
        google {
            accompanist(/* Enter the version of accompanist you want: "0.33.2-alpha" */) {
              implementation(Epit.accompanist_permissions)
                ...
            }
        }
    }
}
```

> **Note**  
> The following libraries are not supported:
>   - `com.google.accompanist:accompanist-insets`
>   - `com.google.accompanist:accompanist-imageloading-core`
>   - `com.google.accompanist:accompanist-glide`
>   - `com.google.accompanist:accompanist-coil`
>   - `com.google.accompanist:accompanist-picasso`

#### Firebase

```kotlin
dependencies {
  epitPreview {
    google {
      firebase(/* Enter the version of firebase bom you would like: "32.6.0" */) {
        implementation(Epit.firebase_auth)
      }
    }
  }
}
```

### Ktor

Unfortunately, the API for ktor is currently extremely experimental and is bound to change.

```kotlin
dependencies {
  epitPreview {
    ktorBom(/* Enter ktor bom version: "2.6.2" */) {
      implementation(Epit.ktor_client_core)
    }
  }
}
```
