package epit.utils

internal infix fun String.joinWithColon(version: String) = buildString {
    append(this@joinWithColon)
    append(":")
    append(version)
}
