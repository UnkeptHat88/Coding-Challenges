package leet_code

fun main() {

    val board1 = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )
    val word1 = "SEE"

    println(exist(board1, word1))

    val board2 = arrayOf(
        charArrayOf('A', 'B', 'C'),
        charArrayOf('F', 'E', 'D'),
        charArrayOf('G', 'H', 'I')
    )
    val word2 = "ABCDEFGHI"

    println(exist(board2, word2))

    val board3 = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )
    val word3 = "ABCB"

    println(exist(board3, word3))
}

fun exist(board: Array<CharArray>, word: String): Boolean {
    val n = board.size
    val m = board[0].size

    fun dfs(i: Int, j: Int, vis: Array<Array<Boolean>>, index: Int): Boolean {

        if (index == word.length) {
            return true
        }

        if (i < 0 || j < 0
            || i >= n || j >= m
            || index > word.length - 1
            || vis[i][j]
            || board[i][j] != word[index]
        ) {
            return false
        }

        vis[i][j] = true

        val found = dfs(i + 1, j, vis, index + 1) ||
                dfs(i, j + 1, vis, index + 1) ||
                dfs(i - 1, j, vis, index + 1) ||
                dfs(i, j - 1, vis, index + 1)

        vis[i][j] = false

        return found
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            val vis: Array<Array<Boolean>> = Array(6) { Array(5) { false } }
            if (dfs(i, j, vis, 0)) {
                return true
            }
        }
    }

    return false
}