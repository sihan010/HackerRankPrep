package week1

private fun timeConversion(s: String): String {
    val meridian = s.takeLast(2)
    var (hour, minute, second) = s.dropLast(2).split(':').map { it.toInt() }
    if (meridian == "AM" && hour == 12)
        hour = 0
    if (meridian == "PM" && hour < 12)
        hour += 12
    return String.format("%02d:%02d:%02d", hour, minute, second)
}

fun main() {
    val res = timeConversion("07:05:45PM")
    println(res)
}