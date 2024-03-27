package week1

private fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val map: MutableMap<String, Int> = HashMap()
    val freq: MutableList<Int> = ArrayList()
    for (s in strings) {
        map[s] = map.getOrDefault(s, 0) + 1
    }
    for (t in queries) {
        freq.add(map.getOrDefault(t, 0))
    }
    return freq.toTypedArray()
}

fun main() {
    val res = matchingStrings(arrayOf("aba", "baba", "aba", "jkhjv"), arrayOf("aba", "jkhjv", "ab"))
    println(res.joinToString(" "))
}