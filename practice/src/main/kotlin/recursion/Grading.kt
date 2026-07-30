package recursion

/*
 * Grading Students
 *
 * HackerLand University has the following grading policy:
 *   - Every student receives a grade in the inclusive range from 0 to 100.
 *   - Any grade less than 40 is a failing grade.
 *
 * Sam, a professor, rounds each student's grade according to these rules:
 *   - If the difference between the grade and the next multiple of 5 is less
 *     than 3, round the grade up to the next multiple of 5.
 *   - If the value of the grade is less than 38, no rounding occurs, since the
 *     result would still be a failing grade.
 *
 * Examples:
 *   84 -> 85  (85 - 84 = 1, less than 3)
 *   29 -> 29  (result would still be less than 40)
 *   57 -> 57  (60 - 57 = 3, not less than 3)
 *
 * Given the initial grade of each of Sam's students, return the grades after
 * rounding.
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {

    val result = mutableListOf<Int>()

    for (grade in grades) {
        val diff = 5 - grade % 5
        result.add(if (grade >= 38 && diff < 3) grade + diff else grade)
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
