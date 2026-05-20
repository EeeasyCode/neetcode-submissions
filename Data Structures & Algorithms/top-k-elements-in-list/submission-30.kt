class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        // 1. nums 를 순회하면서 map value 에 count를 찍어준다.
        // 2. 순회가 끝나면 value 기준 내림차순 정렬 후 상위 k를 출력한다.

        // key: num, value: count
        val dict = mutableMapOf<Int, Int>()

        for (num in nums) {
            dict[num] = (dict[num] ?: 0) + 1
        }

        val result = dict
            .entries
            .sortedByDescending({ it.value })
            .take(k)
            .map({ it.key })
            .toIntArray()
            
        return result
    }
}
