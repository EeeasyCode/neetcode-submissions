class Solution {

    fun encode(strs: List<String>): String {
        val sb = StringBuilder()

        for (str in strs) {
            sb.append(str.length).append("#").append(str)
        }

        return sb.toString()
    }

    // str = 5#Hello5#World
    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()

        var i = 0
        while (i < str.length) {
            val flagIndex = str.indexOf("#", i)
            val len = str.substring(i, flagIndex).toInt()
            result.add(str.substring(flagIndex + 1, flagIndex + len + 1))
            i = flagIndex + len + 1
        }

        return result
    }
}
