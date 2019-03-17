package day1.task3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class TestSecond {
    private fun <T> checkSecondFunctions(list: List<T>, second: T?, penultimate: T?) {
        Assertions.assertEquals(list.secondOrNull(), second, "Wrong `second` element for $list:")
        Assertions.assertEquals(list.penultimateOrNull, penultimate, "Wrong `penultimate` element for $list:")
    }

    @Test
    fun test1Sample() {
        checkSecondFunctions(listOf(1, 2, 3), 2, 2)
    }

    @Test
    fun test2Sample() {
        checkSecondFunctions(listOf("a", "b", "c", "d"), "b", "c")
    }

    @Test
    fun test3() {
        checkSecondFunctions(listOf('a', 'b', 'c', 'd', 'e', 'f', 'x', 'y', 'z'), 'b', 'y')
    }

    @Test
    fun test4OneElement() {
        checkSecondFunctions(listOf(1), null, null)
    }

    @Test
    fun test5Empty() {
        checkSecondFunctions(listOf(), null, null)
    }
}