import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var white = 0
    var black = 0

    repeat(8) {
        br.readLine().forEach { c ->
            when (c) {
                'p' -> black += 1
                'n' -> black += 3
                'b' -> black += 3
                'r' -> black += 5
                'q' -> black += 9
                'P' -> white += 1
                'N' -> white += 3
                'B' -> white += 3
                'R' -> white += 5
                'Q' -> white += 9
            }
        }
    }
    bw.write("${white - black}")

    bw.close()
    br.close()
}