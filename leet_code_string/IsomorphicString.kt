package leet_code_string

fun main() {
    println(isIsomorphicString("egg", "add"))
    println(isIsomorphicString("f11", "b23"))
    println(isIsomorphicString("paper", "title"))

}

fun isIsomorphicString(s1: String, s2: String): Boolean {
    val hm = mutableMapOf<Char, Char>()

    s1.withIndex().forEach {
        if (hm.containsKey(it.value)) {
            if (hm[it.value] != s2[it.index]) {
                return false
            }
        } else {
            hm[it.value] = s2[it.index]
        }
    }

    return true
}