package leet_code_string

fun main() {
    println(firstNonRepeatingCharInString("leetcode"))
    println(firstNonRepeatingCharInString("loveleetcode"))
}

fun firstNonRepeatingCharInString(s1: String): Int {
    val list = Array(26) {0}

    s1.forEach {
        list[it.code - 97] += 1
    }

    s1.forEachIndexed { index, ch ->
        if (list[ch.code - 97] == 1) {
            return index
        }
    }

    return -1
}