package week2

private fun lonelyinteger(a: Array<Int>): Int {
    val counters = mutableMapOf<Int, Int>()
    a.forEach {
        val exists = counters.getOrDefault(it, 0)
        counters[it] = exists + 1
    }
    for (item in counters.entries) {
        if (item.value == 1)
            return item.key
    }
    return a[0]
}

fun main() {
    println(lonelyinteger(arrayOf(1, 2, 3, 4, 3, 2, 1)))
}