package week2

private fun countingValleys(steps: Int, path: String): Int {
    var (valleys, countSteps) = listOf(0,0)
    path.forEach {
        if(countSteps==0 && it=='D') valleys++
        if(it=='U') countSteps++
        else countSteps--
    }
    return valleys
}

fun main(){
    println(countingValleys(8, "UDDDUDUU"))
}