package week1

private fun breakingRecords(scores: Array<Int>): Array<Int> {
    val n = scores.size
    if (n <= 1)
        return arrayOf(0, 0)
    var (min, max) = listOf(scores[0], scores[0])
    var (minR, maxR) = listOf(0, 0)
    for (i in 1 until n) {
        if (scores[i] < min) {
            min = scores[i]
            minR++
            continue
        }
        if (scores[i] > max) {
            max = scores[i]
            maxR++
            continue
        }
    }
    return arrayOf(maxR, minR)
}

fun main() {
    val res = breakingRecords(arrayOf(12, 24))
    println(res.joinToString(","))
    println('a'-32)
}