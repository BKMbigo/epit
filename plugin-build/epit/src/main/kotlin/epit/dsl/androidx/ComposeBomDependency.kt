package epit.dsl.androidx

import epit.annotations.ExperimentalEpitApi

@OptIn(ExperimentalEpitApi::class)
internal val AndroidX.Compose.ComposeBomDependency.moduleName
    get() = when (this) {
        is AndroidX.Compose.Animation -> moduleName
        is AndroidX.Compose.Compiler -> moduleName
        is AndroidX.Compose.Runtime.Runtime -> moduleName
        is AndroidX.Compose.Foundation.Foundation -> moduleName
        is AndroidX.Compose.Material -> moduleName
        is AndroidX.Compose.Material3.Material3 -> moduleName
        is AndroidX.Compose.UI -> moduleName
    }

@OptIn(ExperimentalEpitApi::class)
internal val AndroidX.Compose.moduleName
    get() = when (this) {
        is AndroidX.Compose.Animation -> moduleName
        is AndroidX.Compose.Bom -> moduleName
        is AndroidX.Compose.Compiler -> moduleName
        is AndroidX.Compose.Runtime.Runtime -> moduleName
        is AndroidX.Compose.Runtime.RuntimeTracing -> moduleName
        is AndroidX.Compose.Runtime.RuntimeSavedInstanceState -> moduleName
        is AndroidX.Compose.Foundation.Foundation -> moduleName
        is AndroidX.Compose.Foundation.FoundationText -> moduleName
        is AndroidX.Compose.Material -> moduleName
        is AndroidX.Compose.Material3.Material3 -> moduleName
        is AndroidX.Compose.Material3.Material3Adaptive -> moduleName
        is AndroidX.Compose.UI -> moduleName
    }
