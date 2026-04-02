package leet_code_string

import kotlin.math.sign

fun main() {
    println(myAtoi("42"))
    println(myAtoi(" -042"))
    println(myAtoi("0-1"))
    println(myAtoi("words and 987"))
    println(myAtoi("-91283472332"))
    println(myAtoi("20000000000000000000"))
    println(myAtoi("  0000000000012345678"))
    println(myAtoi("-91283472332"))
    println(myAtoi("-91283472332"))
}

fun myAtoi(s: String): Int {
    if (s.isBlank()) {
        return 0
    }

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    var i = 0
    var n = s.length

    while (i < n && s[i] == ' ') {
        i++
    }

    val sign = if (s[i] == '-') {
        i++
        -1
    } else if (s[i] == '+') {
        i++
        1
    } else {
        1
    }

    var res = 0L
    while (i < n && s[i].isDigit()) {
        res = res * 10 + s[i].code - '0'.code

        if (sign * res < minInt) {
            return minInt
        }
        if (sign * res > maxInt) {
            return maxInt
        }

        i++
    }

    return (sign * res).toInt()
}