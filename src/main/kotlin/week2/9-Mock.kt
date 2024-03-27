package week2

private fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    val s = matrix.size - 1
    val n = matrix.size / 2
    var sum = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            val tl = matrix[i][j]
            val bl = matrix[s - i][j]
            val tr = matrix[i][s - j]
            val br = matrix[s - i][s - j]
            sum += maxOf(maxOf(tl, bl, tr), br)
        }
    }
    return sum
}

fun main() {
    println(
        flippingMatrix(
            arrayOf(
                arrayOf(112, 42, 83, 119),
                arrayOf(56, 125, 56, 49),
                arrayOf(15, 78, 101, 43),
                arrayOf(62, 98, 114, 108),
            )
        )
    )
}