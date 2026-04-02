package leet_code_string

fun main() {
    val s1 = "the sky         is blue"

    val s1L = s1.trim().split(regex = Regex(" +"))

    val sb = StringBuilder()

    for (i in s1L.size - 1 downTo 0) {
        sb.append(s1L[i])
        sb.append(' ')
    }

    println(sb.toString())
}