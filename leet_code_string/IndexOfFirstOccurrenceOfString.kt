package leet_code_string

fun main() {
    val s1 = "sadbutsad"
    val s2 = "sad"

    val s2FirstChar = s2.first()

    for (i in 0..s1.length - s2.length) {
        if (s1[i] == s2FirstChar) {
            if (s1.substring(i, i + s2.length) == s2) {
                println("First occurrence index is $i")
                return
            }
        }
    }

    println("No occurrence found")
}