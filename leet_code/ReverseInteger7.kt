package leet_code

fun main() {
    println(reverseInteger(1534236469))
}

fun reverseInteger(x: Int): Int {
    var sign = 1
    val s = if (x >= 0) {
        x.toString()
    } else {
        sign = -1
        x.toString().substring(1)
    }

    var res = 0
    println(s.reversed())
    s.reversed().forEach {
        if (res >= 214748365) {
            return 0
        }

        println(it.code - 48)
        val temp = res * 10 + (it.code - 48)

        println(temp)

        if (temp < res) {
            return 0
        } else {
            res = temp
        }
    }

    return sign * res
}