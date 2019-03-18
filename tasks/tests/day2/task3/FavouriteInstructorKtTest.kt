package day2.task3

import day2.task2.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.Alphanumeric::class)
class FavouriteInstructorKtTest : TestSchool() {
    private fun checkFavouriteInstructor(
            student: Student,
            schoolLessons: List<Lesson>,
            favInstructor: Instructor?
    ) {
        Assertions.assertEquals(favInstructor,
                schl(schoolLessons).findFavouriteInstructorForStudent(student), "Wrong result for ${student.name}, " +
                "$schoolLessons:")
    }

    @Test
    fun test1() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1)), inst('A'))
    }

    @Test
    fun test2() {
        checkFavouriteInstructor(st(2), listOf(lsn('A', 1)), null)
    }


    @Test
    fun test3() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1), lsn('B', 1)), inst('A'))
    }

    @Test
    fun test4() {
        checkFavouriteInstructor(st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 1)
        ), inst('A'))
    }

    @Test
    fun test5() {
        checkFavouriteInstructor(st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('C', 1),
                lsn('B', 2, 3),
                lsn('A', 4),
                lsn('C', 1, 3)
        ), inst('C'))
    }
}