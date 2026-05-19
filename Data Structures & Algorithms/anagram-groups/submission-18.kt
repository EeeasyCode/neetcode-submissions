class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // 1. strs 배열을 하나씩 순회한다. (str)
        // 2. str을 정렬한 뒤, map에 key를 보고 append 한다. (getOrPut)
        // 3. 순회가 끝나면 map의 각 value를 반환한다.
        val dict = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sortedStr = str.toCharArray().sorted().joinToString("")

            dict.getOrPut(sortedStr) { mutableListOf() }.add(str)
        }

        return dict.values.toList()
    }
}
