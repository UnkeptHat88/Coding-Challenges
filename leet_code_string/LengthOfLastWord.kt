package leet_code_string

fun main() {
    println(lengthOfLastWord("   hello     world    "))
}

fun lengthOfLastWord(str: String): Int {
    val trimmedStr = str.trim()
    var count = 0

    for (i in trimmedStr.length - 1 downTo 0) {
        if (trimmedStr[i] == ' ') {
            break
        } else {
            count++
        }
    }

    return count
}