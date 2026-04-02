package leet_code_string

fun main() {
    println(climbStairs(0, 6))
    println(climbStairs2(6))
}

val map = mutableMapOf<Int, Int>()

fun climbStairs(start: Int, n: Int): Int {
    if (start == n) {
        return 1
    } else if (start > n) {
        return 0
    } else if (map.containsKey(start)) {
        return map[start]!!
    } else {
        val left = climbStairs(start + 1, n)
        val right = climbStairs(start + 2, n)

        map[start] = left + right
        return left + right
    }
}

fun climbStairs2(n: Int): Int {
    var one = 1
    var two = 1

    for (i in 0..n-2) {
        val temp = one
        one += two
        two = temp
    }

    return one
}
