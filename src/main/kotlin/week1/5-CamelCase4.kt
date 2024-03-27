package week1

import java.util.Scanner

private fun camelCase4(lines: List<String>) {
    lines.forEach { line ->
        val (action, type, input) = line.split(';').map { it.trim() }
        when (action) {
            "S" -> split(type, input)
            "C" -> combine(type, input)
        }
    }
}

private fun combine(type: String, input: String) {
    val sb = StringBuilder()
    var spaceFound = false
    when (type) {
        "M" -> {
            input.forEach {
                if (it == ' ') {
                    spaceFound = true
                    return@forEach
                }
                if (spaceFound) {
                    sb.append((it.code - 32).toChar())
                    spaceFound = false
                } else sb.append(it)
            }
            sb.append("()")
        }
        "V" -> {
            input.forEach {
                if (it == ' ') {
                    spaceFound = true
                    return@forEach
                }
                if (spaceFound) {
                    sb.append((it.code - 32).toChar())
                    spaceFound = false
                } else sb.append(it)
            }
        }
        "C" -> {
            input.forEach {
                if (it == ' ') {
                    spaceFound = true
                    return@forEach
                }
                if (spaceFound) {
                    sb.append((it.code - 32).toChar())
                    spaceFound = false
                } else sb.append(it)
            }
            sb.setCharAt(0, sb[0] - 32)
        }
    }
    println(sb.toString())
}

private fun split(type: String, input: String) {
    val sb = StringBuilder()
    when (type) {
        "M" -> {
            input.dropLast(2).forEach {
                if (it.code < 97) {
                    sb.append(' ').append((it.code + 32).toChar())
                } else sb.append(it)
            }
        }
        "V" -> {
            input.forEach {
                if (it.code < 97) {
                    sb.append(' ').append((it.code + 32).toChar())
                } else sb.append(it)
            }
        }
        "C" -> {
            input.forEach {
                if (it.code < 97) {
                    sb.append(' ').append((it.code + 32).toChar())
                } else sb.append(it)
            }
            sb.deleteCharAt(0)
        }
    }
    println(sb.toString())
}

fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    while(scanner.hasNextLine()){
//        lines.add(scanner.nextLine()!!)
//    }
    val lines = mutableListOf(
        "S;M;plasticCup()",
        "C;V;mobile phone",
        "C;C;coffee machine",
        "S;C;LargeSoftwareBook",
        "C;M;white sheet of paper",
        "S;V;pictureFrame"
    )

    camelCase4(lines.toList())
}