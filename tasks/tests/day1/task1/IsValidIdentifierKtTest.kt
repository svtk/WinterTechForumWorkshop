package day1.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class TestValidIdentifier {

    private fun checkValidIdentifier(s: String) {
        Assertions.assertTrue(s.isValidIdentifier(), "'$s' is a valid identifier")
    }

    private fun checkInvalidIdentifier(s: String) {
        Assertions.assertFalse(s.isValidIdentifier(), "'$s' is not a valid identifier")
    }

    @Test fun test1Simple() = checkValidIdentifier("name")

    @Test fun test2StartsWithUnderscore() = checkValidIdentifier("_name")

    @Test fun test3Underscore() = checkValidIdentifier("_")

    @Test fun test4ContainsDigits() = checkValidIdentifier("n01")

    @Test fun test5UpperCase() = checkValidIdentifier("NNN")

    @Test fun test6Valid() = checkValidIdentifier("_N01")

    @Test fun test7Empty() = checkInvalidIdentifier("")

    @Test fun test8StartsWithDigit() = checkInvalidIdentifier("1_")

    @Test fun test9ContainsIllegalCharacters() = checkInvalidIdentifier("&%$")
}
