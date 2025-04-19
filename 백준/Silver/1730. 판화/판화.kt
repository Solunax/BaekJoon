import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = Array(n) { CharArray(n) }
    val command = br.readLine()
    
    repeat(n) {
        map[it].fill('.')
    }

    var x = 0
    var y = 0

    for (c in command) {
        when (c) {
            'D' -> {
                if (y + 1 < n) {
                    if (map[y][x] == '.') {
                        map[y][x] = '|'
                    } else if (map[y][x] == '-') {
                        map[y][x] = '+'
                    }
                    y++
                    if (map[y][x] == '.') {
                        map[y][x] = '|'
                    } else if (map[y][x] == '-') {
                        map[y][x] = '+'
                    }
                }
            }
            'U' -> {
                if (y - 1 >= 0) {
                    if (map[y][x] == '.') {
                        map[y][x] = '|'
                    } else if (map[y][x] == '-') {
                        map[y][x] = '+'
                    }
                    y--
                    if (map[y][x] == '.') {
                        map[y][x] = '|'
                    } else if (map[y][x] == '-') {
                        map[y][x] = '+'
                    }
                }
            }
            'R' -> {
                if (x + 1 < n) {
                    if (map[y][x] == '.') {
                        map[y][x] = '-'
                    } else if (map[y][x] == '|') {
                        map[y][x] = '+'
                    }
                    x++
                    if (map[y][x] == '.') {
                        map[y][x] = '-'
                    } else if (map[y][x] == '|') {
                        map[y][x] = '+'
                    }
                }
            }
            'L' -> {
                if (x - 1 >= 0) {
                    if (map[y][x] == '.') {
                        map[y][x] = '-'
                    } else if (map[y][x] == '|') {
                        map[y][x] = '+'
                    }
                    x--
                    if (map[y][x] == '.') {
                        map[y][x] = '-'
                    } else if (map[y][x] == '|') {
                        map[y][x] = '+'
                    }
                }
            }
        }
    }

    map.forEach {
        bw.write("${it.concatToString()}\n")
    }

    bw.close()
    br.close()
}