package week2

private fun marsExploration(s: String): Int {
    val totalSOS = s.length / 3
    var result = 0
    val sb = java.lang.StringBuilder()
    for(i in 1..totalSOS){
        sb.append("SOS")
    }
    val expected = sb.toString()
    for(i in expected.indices){
        if(s[i]!=expected[i])
            result++
    }
    return result
}

fun main(){
    println(marsExploration("SOSSOT"))
}