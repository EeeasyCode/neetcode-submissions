class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            // 1. left 특수문자나 공백이 나오는 경우 인덱스 + 1
            while (left < right && !s[left].isLetterOrDigit()) left++
            // 2. right 특수문자나 공백이 나오는 경우 인덱스 - 1
            while (left < right && !s[right].isLetterOrDigit()) right--
            // 3. s[left] 와 s[right] 가 다르면 false
            if (s[left].lowercaseChar() != s[right].lowercaseChar()) return false
            // 4. 같으면 각 인덱스 증감
            left++
            right--
        }

        return true
    }
}
