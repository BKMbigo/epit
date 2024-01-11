package epit.annotations

@RequiresOptIn(
    message = "This API is considered internal. Breaking changes may be encountered in your gradle projects.",
    level = RequiresOptIn.Level.WARNING
)
annotation class InternalEpitApi
