class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var answer = 0
        
        for (num in numSet) {
            // 현재 값 - 1 이 set에 없으면 시작점 (연속성이 끊기는 지점)
            if (num - 1 !in numSet) {
                var currentNum = num
                var currentLength = 1
                while (currentNum + 1 in numSet) {
                    currentNum += 1
                    currentLength += 1
                }
                
                answer = maxOf(answer, currentLength)
            }
        }

        return answer
    }
}
