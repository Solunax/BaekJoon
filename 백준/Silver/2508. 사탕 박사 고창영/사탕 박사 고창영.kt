import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>

fun main() {
    repeat(br.readLine().toInt()) {
        br.readLine()
        val (r, c) = br.readLine().split(" ").map { it.toInt() }
        var result = 0
        map = Array(r) { CharArray(c) }

        repeat(r) {
            map[it] = br.readLine().toCharArray()
        }

        for (y in 0 until r) {
            for (x in 0 until c) {
                when (map[y][x]) {
                    '>' -> {
                        if (x + 2 in 0 until c &&
                            map[y][x + 1] == 'o' &&
                            map[y][x + 2] == '<') {
                            map[y][x] = '.'
                            map[y][x + 1] = '.'
                            map[y][x + 2] = '.'
                            result++
                        }
                    }
                    'v' -> {
                        if (y + 2 in 0 until r &&
                            map[y + 1][x] == 'o' &&
                            map[y + 2][x] == '^') {
                            map[y][x] = '.'
                            map[y + 1][x] = '.'
                            map[y + 2][x] = '.'
                            result++
                        }
                    }
                }
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}