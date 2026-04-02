package leet_code_string

import java.lang.Integer.max

fun main() {
    println(getLengthOfLongestSubStringWithRepeatingChars("abcadabcbbasdfghjk"))
}

fun getLengthOfLongestSubStringWithRepeatingChars(s1: String): Int {
    var start = 0
    var max = 0

    val lastIndex = Array(26) {-1}

    for (end in 0 ..< s1.length) {
        start = max(start, lastIndex[s1[end].code - 97] + 1)

        lastIndex[s1[end].code - 97] = end

        max = max(max, end - start + 1)
    }

    return max
}