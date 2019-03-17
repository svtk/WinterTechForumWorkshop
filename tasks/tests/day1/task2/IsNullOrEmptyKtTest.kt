package day1.task2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class TestOrEmpty {
    private fun checkExpectedValue(s: String?, value: Boolean) {
        Assertions.assertEquals(value, s.isNullOrEmpty(), "Wrong result for $s:")
    }

    @Test fun test1() = checkExpectedValue(null, true)

    @Test fun test2() = checkExpectedValue("abc", false)

    @Test fun test3() = checkExpectedValue("s", false)

    @Test fun test4() = checkExpectedValue("", true)
}