package leet_code_string

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
}

fun isSubsequence(s: String, t: String): Boolean {
    var ti = 0

    s.forEach {
        while(true) {
            if (ti == t.length) {
                return false
            }

            if (it == t[ti]) {
                ti++
                break
            }

            ti++
        }
    }

    return true
}