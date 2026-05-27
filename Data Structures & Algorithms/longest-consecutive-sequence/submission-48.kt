class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val sortedNums = nums.sorted()
        val numSetList = sortedNums.toSet().toIntArray()

        if (numSetList.size == 0) return 0

        if (numSetList.size == 1) return 1

        // 정렬된 수를 인덱스로 순회
        var now = 0
        var right = 1
        var count = 1
        val count_list = mutableListOf<Int>()
        for (i in 0..numSetList.size-2) {
            if (numSetList[now] == numSetList[right]-1) {
                now += 1
                right += 1
                count += 1
                count_list.add(count)
            } else {
                count_list.add(count)
                now += 1
                right += 1
                count = 1
            }
        }

        return count_list.max()
    }
}
