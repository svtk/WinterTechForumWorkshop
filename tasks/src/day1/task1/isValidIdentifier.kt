package day1.task1

/*
 * Create a function that checks whether the given string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter
 * or underscore and consists of only letters, digits and underscores.
 */
fun String.isValidIdentifier(): Boolean {
    TODO()
}

fun main() {
    println("name".isValidIdentifier())  // true
    println("0name".isValidIdentifier()) // false
}