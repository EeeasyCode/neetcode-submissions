class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // 1. 각 row 중복 비교
        for (row in board) {
            var tempRowSet = mutableSetOf<Int>()
            for (data in row) {
                if (data == '.') continue

                if (!tempRowSet.add(data.toInt())) return false
            }
        }
        // 2. 각 col 중복 비교
        for (i in 0..8) {
            var tempColSet = mutableSetOf<Int>()
            for (j in 0..8) {
                if (board[j][i] == '.') continue

                if (!tempColSet.add(board[j][i].toInt())) return false
            }
        }

        // 3. 각 3x3 영역 중복 비교
        for (i in 0..8 step 3) {
            for (j in 0..8 step 3) {
                var tempBoxSet = mutableSetOf<Int>()
                for (r in i until i + 3) {
                    for (c in j until j + 3) {
                        if (board[r][c] == '.') continue
                        if (!tempBoxSet.add(board[r][c].toInt())) return false
                    }
                }
            }
        }

        return true
    }
}
