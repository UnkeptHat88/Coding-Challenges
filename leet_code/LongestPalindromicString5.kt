package leet_code

fun main() {
    println(longestPalindromicString("aaaaa"))
}

fun longestPalindromicString(s :String): String {
    if (s.length <= 1) {
        return s
    }

    var maxStr = ""

    s.forEachIndexed { i, ch ->
        val even = expandFromCenter(s, i, i + 1)
        val odd = expandFromCenter(s, i - 1, i + 1)

        println("$even $odd")

        if (even.length > maxStr.length) {
            maxStr = even
        } else if (odd.length > maxStr.length) {
            maxStr = odd
        }
    }

    return maxStr
}

fun expandFromCenter(s: String, left: Int, right: Int): String {
    var l = left
    var r = right

    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }

    return s.substring(l + 1, r)
}