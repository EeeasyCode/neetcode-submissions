class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // s와 t를 정렬해서 비교 후 같으면 true, 다르면 false 반환
        val s_sort = s.toList().sorted().joinToString()
        val t_sort = t.toList().sorted().joinToString()
        
        if (s_sort == t_sort) return true

        return false
    }
}
