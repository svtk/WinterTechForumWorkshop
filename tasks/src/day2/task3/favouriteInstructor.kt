package day2.task3

import day2.task2.*

/*
Implement the `findFavouriteInstructorForStudent()` function.
It takes `Student` as a parameter and finds an instructor which classes this
student takes more often.
If there're several such instructors, the first one is returned,
if a student took no classes at all yet, `null` is returned.
*/

fun School.findFavouriteInstructorForStudent(student: Student): Instructor? {
    return lessons
        .filter { student in it.students }
        .groupBy { it.instructor }
        .maxBy { (_, lessons) -> lessons.size }
        ?.key
}