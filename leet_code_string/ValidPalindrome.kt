package leet_code_string

fun main() {
    println(isValidPalindrome("A man, a plan, a canal: Panama"))
    println(isValidPalindrome("race a car"))
    println(isValidPalindrome(" "))
}

fun isValidPalindrome(s1: String): Boolean {
    val charArray = mutableListOf<Char>()

    s1.forEach {
        if (it.isLetter()) {
            charArray.add(it.lowercaseChar())
        }
    }

    return isPalindrome(charArray)
}

fun isPalindrome(s1: List<Char>): Boolean {
    if (s1.isEmpty()) {
        return true
    }

    var end = s1.size - 1

    for (start in 0..s1.size/2) {
        if (s1[start] != s1[end]) {
            return false
        }

        end--
    }

    return true
}