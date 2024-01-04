import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val scroll = br.readLine()
    val road = listOf(br.readLine(), br.readLine())
    var result = 0

    repeat(2) { idx ->
        val dp = Array(scroll.length + 1) { Array(road[0].length + 1) { 0 } }
        dp[0].fill(1)

        for (i in 1..scroll.length) {
            val selectedRoad = road[(i - idx) and 1]

            for (j in 1..selectedRoad.length) {
                dp[i][j] = dp[i][j - 1] + if (selectedRoad[j - 1] == scroll[i - 1]) {
                    dp[i - 1][j - 1]
                } else {
                    0
                }
            }
        }

        result += dp[scroll.length][road[0].length]
    }
    bw.write("$result")

    bw.close()
    br.close()
}