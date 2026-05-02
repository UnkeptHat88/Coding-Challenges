package leet_code

import kotlin.math.max

fun main() {

}

fun maxSubArray(nums: IntArray): Int {
    var res = nums[0]
    var total = 0

    nums.forEach {
        if (total < 0) {
            total = 0
        }

        total += it
        res = max(res, total)
    }

    return res
}