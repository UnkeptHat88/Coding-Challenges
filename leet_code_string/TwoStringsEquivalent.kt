package leet_code_string

fun main() {

}

fun isStringsEquivalent(s1: String, s2: String): Boolean {
    val charCount = Array<Int>(26) {0}

    s1.forEach {
        charCount[it.code - 97] += 1
    }

    s2.forEach {
        charCount[it.code - 97] -= 1
    }

    charCount.forEach {
        if (it > 3) {
            return false
        }
    }

    return true
}