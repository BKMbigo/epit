package epit.dsl.google

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon

@ExperimentalEpitApi
sealed interface Google : EpitDependency {

    @ExperimentalEpitApi
    enum class Accompanist(
        internal val moduleName: String
    ) : Google {
        accompanist_permissions(moduleName = "com.google.accompanist:accompanist-permissions"),
        accompanist_navigation_material(moduleName = "com.google.accompanist:accompanist-navigation-material"),
        accompanist_drawablepainter(moduleName = "com.google.accompanist:accompanist-drawablepainter"),
        accompanist_adaptive(moduleName = "com.google.accompanist:accompanist-adaptive"),
        accompanist_systemuicontroller(moduleName = "com.google.accompanist:accompanist-systemuicontroller"),
        accompanist_webview(moduleName = "com.google.accompanist:accompanist-webview"),
        accompanist_themeadapter_material3(moduleName = "com.google.accompanist:accompanist-themeadapter-material3"),
        accompanist_themeadapter_material(moduleName = "com.google.accompanist:accompanist-themeadapter-material"),
        accompanist_themeadapter_core(moduleName = "com.google.accompanist:accompanist-themeadapter-core"),
        accompanist_themeadapter_appcompat(moduleName = "com.google.accompanist:accompanist-themeadapter-appcompat"),
        accompanist_testharness(moduleName = "com.google.accompanist:accompanist-testharness"),
        accompanist_swiperefresh(moduleName = "com.google.accompanist:accompanist-swiperefresh"),
        accompanist_placeholder_material3(moduleName = "com.google.accompanist:accompanist-placeholder-material3"),
        accompanist_placeholder_material(moduleName = "com.google.accompanist:accompanist-placeholder-material"),
        accompanist_placeholder(moduleName = "com.google.accompanist:accompanist-placeholder"),
        accompanist_pager_indicators(moduleName = "com.google.accompanist:accompanist-pager-indicators"),
        accompanist_pager(moduleName = "com.google.accompanist:accompanist-pager"),
        accompanist_navigation_animation(moduleName = "com.google.accompanist:accompanist-navigation-animation"),
        accompanist_insets_ui(moduleName = "com.google.accompanist:accompanist-insets-ui"),
        accompanist_flowlayout(moduleName = "com.google.accompanist:accompanist-flowlayout"),
        accompanist_appcompat_theme(moduleName = "com.google.accompanist:accompanist-appcompat-theme");
//        accompanist_insets(moduleName = "com.google.accompanist:accompanist-insets");

        override fun withVersion(version: String): String = moduleName joinWithColon version

    }
}
