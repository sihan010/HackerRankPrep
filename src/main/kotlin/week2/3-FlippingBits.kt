package week2

private fun flippingBits(n: Long): Long {
    val binary = n.toString(2).padStart(32,'0')
    val sb = java.lang.StringBuilder(32)
    binary.forEach {
        if(it=='0') sb.append('1')
        else sb.append('0')
    }
    val flipped = sb.toString()
    return flipped.toLong(2)
}

fun main(){
    println(flippingBits(9))
}