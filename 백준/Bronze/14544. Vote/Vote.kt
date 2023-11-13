import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { v -> v.toInt() }

        val candidate = HashMap<String, Int>()

        repeat(n) {
            candidate[br.readLine()] = 0
        }

        repeat(m) {
            val (name, vote, _) = br.readLine().split(" ")
            candidate[name] = candidate[name]!! + vote.toInt()
        }


        val data = candidate.toList().sortedByDescending { v -> v.second }

        if (data[0].second != data[1].second){
            bw.write("VOTE ${it + 1}: THE WINNER IS ${data[0].first} ${data[0].second}\n")
        } else {
            bw.write("VOTE ${it + 1}: THERE IS A DILEMMA\n")
        }
    }

    bw.close()
    br.close()
}