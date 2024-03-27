package week1

private fun miniMaxSum(arr: Array<Int>): Unit {
    var (sum, min, max) = listOf(0u, arr[0].toULong(), arr[0].toULong())
    arr.forEach {
        val longIt = it.toULong()
        sum += longIt
        if (longIt<min) {
            min = longIt
            return@forEach
        }
        if (longIt > max) {
            max = longIt
            return@forEach
        }
    }
    println("${sum - max} ${sum - min}")
}

fun main() {
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
}