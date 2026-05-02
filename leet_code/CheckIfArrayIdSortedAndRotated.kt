package leet_code

fun main() {

}

fun check(nums: IntArray): Boolean {
    var count = 0

    if (nums[0] < nums[nums.size - 1]) {
        count++
    }

    for (i in 1..<nums.size) {
        if (nums[i - 1] <= nums[i]) {

        } else {
            count++
        }

        if (count > 1) {
            return false
        }
    }

    return true
}