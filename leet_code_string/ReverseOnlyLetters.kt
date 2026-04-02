package leet_code_string

fun main() {
    println(reverseOnlyLetters("ab-cd"))
    println(reverseOnlyLetters("a-bC-dEf-ghIj"))
    println(reverseOnlyLetters("Test1ng-Leet=code-Q!"))
}

fun reverseOnlyLetters(s1: String): String {
    val charArray = s1.toCharArray()

    var i = 0
    var j = s1.length - 1

    while (i < j) {
        if (!charArray[i].isLetter()) {
            i++
        } else if (!charArray[j].isLetter()) {
            j--
        } else {
            val temp = charArray[i]
            charArray[i] = charArray[j]
            charArray[j] = temp

            i++
            j--
        }
    }

    return charArray.joinToString("")
}