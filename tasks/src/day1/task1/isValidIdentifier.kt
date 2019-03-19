package day1.task1

/*
 * Create a function that checks whether the given string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter
 * or underscore and consists of only letters, digits and underscores.
 */
fun String.isValidIdentifier(): Boolean {
    fun isValidCharacterV1(ch: Char): Boolean =
        ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z' ||
                ch in '0'..'9'

    fun isValidCharacter(ch: Char): Boolean =
        ch == '_' || ch.isLetterOrDigit()

    if (isEmpty() || this[0].isDigit()) return false
    for (ch in this) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun main() {
    println("name".isValidIdentifier())  // true
    println("0name".isValidIdentifier()) // false
}