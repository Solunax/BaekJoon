import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val rank = ArrayList<Score>()

    repeat(n) {
        val (b, p, q, r) = br.readLine().split(" ").map { it.toInt() }
        rank.add(Score(b, p, q, r))
    }
    rank.sort()

    repeat(3) {
        bw.write("${rank[it].num} ")
    }

    bw.close()
    br.close()
}

data class Score(val num: Int, val p: Int, val q: Int, val r: Int) : Comparable<Score> {
    private val total = p * q * r
    private val sum = p + q + r

    override fun compareTo(other: Score): Int {
        return if (this.total != other.total) {
            this.total - other.total
        } else if (this.sum != other.sum) {
            this.sum - other.sum
        } else {
            this.num - other.num
        }
    }
}