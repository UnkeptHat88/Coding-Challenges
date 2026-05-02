package leet_code

fun main() {
    // [1, 2, 0, 4, 5, 0]
    println(moveZeros(intArrayOf(1, 2, 0, 4, 5, 0, 0, 0, 0, 6)).toList())
}

fun moveZeros(nums: IntArray): IntArray {

    for (i in 0..<nums.size) {
        if (nums[i] == 0) {
            // find next element
            for (j in i..<nums.size) {
                if (nums[j] != 0) {
                    nums[i] = nums[j]
                    nums[j] = 0
                    break
                }
            }
        }
    }

    return nums
}