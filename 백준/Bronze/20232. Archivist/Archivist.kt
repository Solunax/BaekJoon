import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val archive = listOf("ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "ITMO",
    "PetrSU, ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO",
    "ITMO", "ITMO", "SPbSU", "ITMO")

    bw.write(archive[br.readLine().toInt() - 1995])

    bw.close()
    br.close()
}