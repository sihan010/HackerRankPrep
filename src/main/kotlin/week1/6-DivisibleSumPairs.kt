package week1

private fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var res = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if ((ar[i] + ar[j]) % k == 0)
                res++
        }
    }
    return res
}

fun main() {
    val res = divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2))
    println(res)
}