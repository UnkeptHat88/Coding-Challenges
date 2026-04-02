package leet_code_string

import kotlin.math.min

fun main() {
    println(longestCommonFactor(mutableListOf("flower","flow","flight")))
    println(longestCommonFactor(mutableListOf("dog","racecar","car")))
}

fun longestCommonFactor(l1: MutableList<String>): String {
    if (l1.isEmpty()) {
        return ""
    }

    if (l1.size == 1) {
        return l1[0]
    }
    l1.sort()

    val s1 = l1.first()
    val s2 = l1.last()

    val minLength = min(s1.length,s2.length)
    (0 ..< minLength).forEach {
        if (s1[it] != s2[it]) {
            return s1.substring(0, it)
        }
    }

    return s1
}