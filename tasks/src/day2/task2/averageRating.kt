package day2.task2

/*
The next two tasks use the classes `Instructor`, `Student`, `Lesson`
and `School` defined in `School.kt`. It represents an online language school
that provides a service to organize remote lessons for an instructor and a group
of students. Each student can sign up for classes with different instructors.
After the lesson a student can rate it, and these ratings are stored together
with the other information about the lesson.

Implement the `getAverageRatingForInstructor()` function which takes
`Instructor` as a parameter and calculates the average rating that the
instructor was given by all the students that attended his or her classes.
If a student attended several lessons of the instructor, the ratings for
individual lessons should be treated separately.
 */

fun School.getAverageRatingForInstructor(instructor: Instructor): Double {
    return lessons
        .filter { it.instructor == instructor }
        .flatMap { it.rating.values.asSequence() }
        .average()
}