package arrays

/**
 * Two Sum — return indices of the two numbers that add up to target.
 * Assumes exactly one solution exists; cannot use the same element twice.
 *
 * Time: O(n)  |  Space: O(n)
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val seen = HashMap<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        seen[complement]?.let { return intArrayOf(it, i) }
        seen[nums[i]] = i
    }
    error("No solution")
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).toList()) // [0, 1]
    println(twoSum(intArrayOf(3, 2, 4), 6).toList())      // [1, 2]
}
