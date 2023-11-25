package epit.annotations

@RequiresOptIn(
    message = "This API is considered experimental. Please use with caution",
    level = RequiresOptIn.Level.WARNING
)
annotation class ExperimentalEpitApi
