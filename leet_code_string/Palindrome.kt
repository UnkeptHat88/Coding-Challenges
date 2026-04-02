package leet_code_string

fun main() {
    val s1 = "level"

    println("Is palindrome: ${isPalindrome(s1)}")
}

fun isPalindrome(s1: String): Boolean {
    var lp = 0
    var rp = s1.length - 1

    (0 .. s1.length / 2).forEach { _ ->
        if (s1[lp] != s1[rp]) {
            return false
        }

        lp++
        rp--
    }

    return true
}