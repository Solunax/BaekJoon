import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var dp: Array<Array<Int>>
lateinit var blockDate: Array<Boolean>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    dp = Array(n + 1) { Array(n + 1) { -1 } }
    blockDate = Array(n + 1) { false }

    if (m != 0) {
        val blockDayInput = br.readLine().split(" ").map { it.toInt() }
        
        repeat(m) {
            blockDate[blockDayInput[it]] = true
        }
    }

    bw.write("${search(1, 0)}")

    bw.close()
    br.close()
}

fun search(day: Int, coupon: Int): Int {
    if (day > n) {
        return 0
    }

    if (dp[day][coupon] != -1) {
        return dp[day][coupon]
    }

    dp[day][coupon] = Int.MAX_VALUE

    if (blockDate[day]) {
        dp[day][coupon] = min(dp[day][coupon], search(day + 1, coupon))
        return dp[day][coupon]
    } else {
        if (coupon >= 3) {
            dp[day][coupon] = min(dp[day][coupon], search(day + 1, coupon - 3))
        }

        dp[day][coupon] = min(dp[day][coupon], search(day + 1, coupon) + 10000)
        dp[day][coupon] = min(dp[day][coupon], search(day + 3, coupon + 1) + 25000)
        dp[day][coupon] = min(dp[day][coupon], search(day + 5, coupon + 2) + 37000)
    }

    return dp[day][coupon]
}