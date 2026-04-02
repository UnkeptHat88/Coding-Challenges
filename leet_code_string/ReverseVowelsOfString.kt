package leet_code_string

fun main() {
    println(reverseVowelsOfString("kieghbvn"))
    println(reverseVowelsOfString("aeiou"))
    println(reverseVowelsOfString("hello"))
}

fun reverseVowelsOfString(s1: String): String {
    val s2 = s1.toCharArray()
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')

    var start = 0
    var end = s2.size - 1

    while (start < end) {
        if (s1[start] in vowels) {
            if (s1[end] in vowels) {
                val temp = s2[start]
                s2[start] = s2[end]
                s2[end] = temp

                start++
                end--
            }
        } else {
            start++
        }

        if (s1[end] !in vowels) {
            end--
        }
    }

    return s2.joinToString("")
}