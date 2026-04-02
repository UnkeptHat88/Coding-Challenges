package leet_code_string

fun main() {
    println(isAnagram("kiran", "irank"))
}

fun isAnagram(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) {
        return false
    } else {
        val charCount = Array<Int>(26) {0}

        s1.forEach {
            val index = it.code - 97
            charCount[index]+=1
        }

        s2.forEach {
            val index = it.code - 97
            charCount[index]-=1
        }

        charCount.forEach {
            if (it != 0) {
                return false
            }
        }

        return true
    }
}