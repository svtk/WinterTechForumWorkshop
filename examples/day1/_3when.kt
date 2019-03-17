package day1

fun getCloudinessDescription(cloudiness: Int): String =
    when (cloudiness) {
        in 81..100 -> "Sunny"
        in 61..80 -> "Mostly Sunny"
        in 41..60 -> "Partly Sunny"
        in 21..40 -> "Mostly Cloudy"
        in 0..20 -> "Cloudy"
        else -> throw IllegalArgumentException(
            "Cloudiness value should be between 0 and 100")
    }

fun main() {
    println(getCloudinessDescription(87)) // "Sunny"
    println(getCloudinessDescription(33)) // "Mostly Cloudy"
}