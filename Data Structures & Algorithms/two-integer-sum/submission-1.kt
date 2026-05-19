class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // 1. nums를 순회한다. (i)
        // 2. 그 안에서도 또 nums를 순회한다. (i+1)
        // 3. nums[i] + nums[(i+1)] == target 일 때, [i, i+1] 반환

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        return intArrayOf()
    }
}
