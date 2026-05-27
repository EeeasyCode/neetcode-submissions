class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleanString = s.filter { it.isLetterOrDigit() }.lowercase()

        return cleanString == cleanString.reversed()
    }
}
