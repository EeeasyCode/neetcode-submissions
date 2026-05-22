class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxs = Array(9) { mutableSetOf<Char>() }

        for (row in 0..8) {
            for (col in 0..8) {
                val data = board[row][col]
                if (data == '.') continue

                val boxIndex = col / 3 * 3 + row / 3
                if (!rows[row].add(data) || !cols[col].add(data) || !boxs[boxIndex].add(data)) return false
            }
        }

        return true
    }
}
