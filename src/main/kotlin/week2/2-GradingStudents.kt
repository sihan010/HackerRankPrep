package week2

private fun gradingStudents(grades: Array<Int>): Array<Int> {
    val roundedGrades = mutableListOf<Int>()
    for (grade in grades) {
        if (grade % 5 == 0) {
            roundedGrades.add(grade)
            continue
        }
        val nextMultiple = ((grade / 5) + 1) * 5
        if ((nextMultiple - grade < 3) && nextMultiple>=40) roundedGrades.add(nextMultiple)
        else roundedGrades.add(grade)
    }
    return roundedGrades.toTypedArray()
}

fun main() {
    println(gradingStudents(arrayOf(84, 29, 57)).toList())
}