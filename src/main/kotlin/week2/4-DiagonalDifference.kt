package week2

import kotlin.math.abs

private fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val n = arr.size
    var (lr, rl) = listOf(0, 0)
    for (i in 0 until n) {
        lr += arr[i][i]
        rl += arr[i][n - 1 - i]
    }
    return abs(lr - rl)
}

fun main() {
    println(
        diagonalDifference(
            arrayOf(
                arrayOf(1, 2, 3),
                arrayOf(4, 5, 6),
                arrayOf(9, 8, 9)
            )
        )
    )
}