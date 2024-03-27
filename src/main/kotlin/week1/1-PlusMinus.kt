package week1

private fun plusMinus(arr: Array<Int>){
    val n = arr.size
    var (positive, negative, zeros) = listOf(0.0,0.0,0.0)
    arr.forEach {
        if(it==0)
            zeros++
        else if(it<0)
            negative++
        else positive++
    }
    println(String.format("%.6f", positive/n))
    println(String.format("%.6f", negative/n))
    println(String.format("%.6f", zeros/n))
}

fun main(){
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}