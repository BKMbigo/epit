package epit.annotations

@RequiresOptIn(message = "You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
annotation class EpitInvalidApi
