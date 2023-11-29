package epit.annotations

@RequiresOptIn(
    message = "This API is experimental. You may experience braking changes as you update the plugin",
    level = RequiresOptIn.Level.WARNING
)
annotation class ExperimentalEpitApi
