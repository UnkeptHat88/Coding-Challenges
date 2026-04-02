package leet_code_string

fun main() {
    println(wordPatternExists("abba", "dog cat cat dog"))
    println(wordPatternExists("abba", "dog cat cat fish"))
}

fun wordPatternExists(pattern: String, s1: String): Boolean {
    val pValue = mutableMapOf<Char, String>()
    val strList = s1.split(" ")

    if (strList.size != pattern.length) {
        return false
    }

    for (i in 0..<pattern.length) {

        if (pValue.containsKey(pattern[i])) {
            if (pValue[pattern[i]] != strList[i]) {
                return false
            }
        } else {
            pValue[pattern[i]] = strList[i]
        }
    }

    return true
}