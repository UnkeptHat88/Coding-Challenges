package leet_code_string

fun main() {
    println(findTheDifference("abcd", "abcde"))
    println(findTheDifference("", "y"))
}

fun findTheDifference(s1: String, s2: String): Char {
    if (s1.isEmpty()) {
        return s2.first()
    }

    val s1Sum = s1.map { it.code }.reduce { acc, i -> acc + i }
    val s2Sum = s2.map { it.code }.reduce { acc, i -> acc + i }

    return (s2Sum - s1Sum).toChar()
}