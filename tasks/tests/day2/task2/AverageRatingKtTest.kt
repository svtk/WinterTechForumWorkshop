package day2.task2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

abstract class TestSchool {
    private val instructors = ('A'..'D')
            .map { it to Instructor("Instructor-$it") }
            .toMap()

    protected fun inst(c: Char) = instructors.getValue(c)

    private val students = (1..7)
            .map { it to Student("Student-$it") }
            .toMap()

    protected fun st(i: Int) = students.getValue(i)

    protected fun lsn(instructor: Char, vararg students: Int) =
            Lesson(inst(instructor), students.map { st(it) }.toSet(), mapOf())

    protected fun lsn(instructor: Char, vararg ratings: Pair<Int, Int>): Lesson {
        val ratingsMap = ratings.toMap().mapKeys { (_, i) -> st(i) }
        return Lesson(inst(instructor),
                ratingsMap.keys,
                ratingsMap)
    }

    protected fun schl(lessons: List<Lesson>) =
            School(instructors.values.toSet(), students.values.toSet(),
                    lessons.asSequence())
}

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class AverageRatingKtTest : TestSchool() {

    private fun checkAverageRating(
            instructor: Instructor,
            schoolLessons: List<Lesson>,
            rating: Double
    ) {
        Assertions.assertEquals(rating,
                schl(schoolLessons).getAverageRatingForInstructor(instructor),
                0.0001, "Wrong result for ${instructor.name}, " +
                "$schoolLessons:")
    }

    @Test
    fun test1() {
        checkAverageRating(inst('A'), listOf(lsn('A', 1 to 5)), 5.0)
    }

    @Test
    fun test2() {
        checkAverageRating(inst('A'), listOf(
                lsn('A', 1 to 5, 2 to 4),
                lsn('B', 1 to 4, 2 to 4, 3 to 4),
                lsn('A', 1 to 4, 3 to 5)
        ), 4.5)
    }

    @Test
    fun test3() {
        checkAverageRating(inst('C'), listOf(
                lsn('A', 2 to 4, 3 to 5),
                lsn('C', 1 to 5, 2 to 5),
                lsn('C', 1 to 3, 2 to 3),
                lsn('B', 1 to 4, 2 to 5, 3 to 3),
                lsn('C', 3 to 4)
        ), 4.0)
    }
}