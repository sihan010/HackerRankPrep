package week2

private fun countingSort(arr: Array<Int>): Array<Int> {
    val result = Array(arr.max().plus(1)) { 0 }
    arr.forEach {
        result[it]++
    }
    return result
}

fun main() {
    println(countingSort(arrayOf(1, 1, 3, 2, 1)).toList())
}