package week2

private enum class Results(val value:String){
    PANGRAM("pangram"),
    NOT_PANGRAM("not pangram")
}

private fun pangrams(s: String): String {
    val alphabets = Array(26){0}
    s.forEach {
        val code = it.toLowerCase().toInt()-97
        if(code in 0..26){
            alphabets[code]++
        }
    }
    alphabets.forEach {
        if(it==0)
            return Results.NOT_PANGRAM.value
    }
    return Results.PANGRAM.value
}

fun main(){
    println(pangrams("We promptly judged antique ivory buckles for the next prize"))
}