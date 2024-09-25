import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = Array(5) { CharArray(17) }
val num = listOf(
    "####.##.##.####",
    "..#..#..#..#..#",
    "###..#####..###",
    "###..####..####",
    "#.##.####..#..#",
    "####..###..####",
    "####..####.####",
    "###..#..#..#..#",
    "####.#####.####",
    "####.####..####"
)

fun main() {
    val time = arrayOf(2, 9, 5, 9)

    repeat(5) {
        input[it] = br.readLine().toCharArray()
    }

    for (i in 0 until 4) {
        for (j in 0 .. time[i]) {
            if (check(i * 4, j)) {
                bw.write("$j")
                break
            }
        }

        if (i == 1) {
            bw.write(":")
        }
    }

    bw.close()
    br.close()
}

fun check(x: Int, d: Int): Boolean {
    for (i in 0 until 5) {
        for (j in 0 until 3) {
            if (input[i][j + x] == '#' && num[d][i * 3 + j] == '.') {
                return false
            }
        }
    }

    return true
}