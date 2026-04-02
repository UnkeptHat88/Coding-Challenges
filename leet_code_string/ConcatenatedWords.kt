package leet_code_string

fun main() {
    println(getAllConcatenatedWords(arrayOf("cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat")))
    println(getAllConcatenatedWords(arrayOf("cat","dog","catdog")))
}

fun getAllConcatenatedWords(l1: Array<String>): List<String> {
    val s1 = l1.toSet()
    val concatenatedWords = mutableMapOf<String, Boolean>()

    val res = mutableListOf<String>()

    l1.forEach {
        if (isConcatenated(it, s1, concatenatedWords)) {
            res.add(it)
        }

    }

    return res
}

fun isConcatenated(word: String, setOfWords: Set<String>, concatenatedWords: MutableMap<String, Boolean>): Boolean {
    if (concatenatedWords.contains(word)) {
        return concatenatedWords[word]!!
    }

    for (i in 1..<word.length) {
        val prefix = word.substring(0, i)
        val suffix = word.substring(i, word.length)

        if (setOfWords.contains(prefix) && setOfWords.contains(suffix)
            || setOfWords.contains(prefix) && isConcatenated(suffix, setOfWords, concatenatedWords)) {

            concatenatedWords[word] = true
            return true
        }
    }

    concatenatedWords[word] = false
    return false
}