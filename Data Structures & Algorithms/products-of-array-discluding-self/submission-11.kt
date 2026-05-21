class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size)

        resultArray[0] = 1
        for (index in 1 until nums.size) {
           resultArray[index] = resultArray[index-1] * nums[index-1]
        }

        var right = 1
        for (index in (nums.size - 1) downTo 0) {
            resultArray[index] = resultArray[index] * right
            right = right * nums[index]
        } 

        return resultArray
    }
}
