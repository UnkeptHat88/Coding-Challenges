package leet_code

fun main() {
    println(twoSum(intArrayOf(2,7,11,15), 9).toList())
    println(twoSum(intArrayOf(3,2,4), 6).toList())
    println(twoSum(intArrayOf(3,3), 6).toList())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    nums.withIndex().forEach {
        if (map.contains(it.value)) {
            return intArrayOf(map[it.value]!!, it.index)
        }

        val key = target - it.value
        map[key] = it.index
    }

    return intArrayOf(0, 0)
}