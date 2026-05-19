class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        // nums 를 순회하면서 동일한 수가 있다면 true, 없으면 false.
        val seen = HashSet<Int>()

        for (num in nums) {
            if (!seen.add(num)) return true
        }

        return false
    }
}
