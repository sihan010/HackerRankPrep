package week1

private fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    return arr[arr.size/2]
}

fun main(){
    println(findMedian(arrayOf(1,2,3,4,5)))
}