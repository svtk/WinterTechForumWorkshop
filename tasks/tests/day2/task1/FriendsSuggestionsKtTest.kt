package day2.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import kotlin.collections.flatMap as flatMapLibrary

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class FriendsSuggestionsKtTest {
    @Test
    fun test1Sample() {
        val alice = Person("Alice")
        val bob = Person("Bob")
        val charlie = Person("Charlie")

        alice.friends += bob
        bob.friends += alice
        bob.friends += charlie
        charlie.friends += bob

        Assertions.assertEquals(setOf(charlie), getFriendSuggestions(alice), "Wrong result for sample")
    }

    @Test
    fun test2() {
        val persons = (0..6).map { Person("#$it") }
        fun connection(i: Int, j: Int) {
            persons[i].friends += persons[j]
            persons[j].friends += persons[i]
        }
        connection(0, 1)
        connection(0, 2)
        connection(1, 3)
        connection(1, 4)
        connection(5, 6)

        Assertions.assertEquals(listOf(3, 4).map { persons[it] }.toSet(),
            getFriendSuggestions(persons[0]), "Wrong suggestions for #0 in $persons")
    }

    @Test
    fun test3() {
        val persons = (0..2).map { Person("#$it") }
        fun connection(i: Int, j: Int) {
            persons[i].friends += persons[j]
            persons[j].friends += persons[i]
        }
        connection(0, 1)
        connection(0, 2)
        connection(1, 2)

        Assertions.assertEquals(setOf<Person>(),
            getFriendSuggestions(persons[0]), "Wrong suggestions for #0 in $persons")
    }

    @Test
    fun test4() {
        val persons = (0..4).map { Person("#$it") }
        fun connection(i: Int, j: Int) {
            persons[i].friends += persons[j]
            persons[j].friends += persons[i]
        }
        connection(0, 1)
        connection(0, 2)
        connection(1, 3)
        connection(3, 4)

        Assertions.assertEquals(setOf(persons[3]),
            getFriendSuggestions(persons[0]), "Wrong suggestions for #0 in $persons")
    }


    @Test
    fun test5() {
        val persons = (0..6).map { Person("#$it") }
        fun connection(i: Int, j: Int) {
            persons[i].friends += persons[j]
            persons[j].friends += persons[i]
        }
        connection(0, 1)
        connection(0, 2)
        connection(1, 3)
        connection(3, 4)
        connection(2, 4)

        Assertions.assertEquals(listOf(3, 4).map { persons[it] }.toSet(),
            getFriendSuggestions(persons[0]), "Wrong suggestions for #0 in $persons")
    }
}