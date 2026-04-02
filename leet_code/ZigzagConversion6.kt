package leet_code

fun main() {
    println(zigzagConversion("PAYPALISHIRING", 3))
    println(zigzagConversion("AB", 1))
}

fun zigzagConversion(s: String, numRows: Int): String {
    if (numRows == 1) {
        return s
    }

    var inc = true
    var index = 0

    val arr = Array<MutableList<Char>>(numRows) {mutableListOf()}

    s.forEach {
        arr[index].add(it)

        if (inc) {
            index++
        } else {
            index--
        }

        if (index == numRows - 1) {
            inc = false
        } else if (index == 0) {
            inc = true
        }
    }

    var res = ""

    arr.forEach {
        res += it.joinToString("")
    }

    return res
}