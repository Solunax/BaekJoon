import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val mbti = br.readLine().split(" ")

        if (n >= 33) {
            bw.write("0\n")
        } else {
            var result = Int.MAX_VALUE

            for (a in 0 until n) {
                for (b in a + 1 until n) {
                    for (c in b + 1 until n) {
                        var total = 0
                        repeat(4) {
                            total += if (mbti[a][it] != mbti[b][it]) 1 else 0
                            total += if (mbti[b][it] != mbti[c][it]) 1 else 0
                            total += if (mbti[a][it] != mbti[c][it]) 1 else 0
                        }

                        result = min(result, total)

                        if (result == 0) {
                            break
                        }
                    }
                }
            }

            bw.write("$result\n")
        }
    }

    bw.close()
    br.close()
}