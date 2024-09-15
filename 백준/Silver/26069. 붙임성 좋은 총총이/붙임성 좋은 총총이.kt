import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dance = HashSet<String>()
    dance.add("ChongChong")

    repeat(n) {
        val (p1, p2) = br.readLine().split(" ")

        if (dance.contains(p1) || dance.contains(p2)) {
            dance.add(p1)
            dance.add(p2)
        }
    }
    bw.write("${dance.size}")

    bw.close()
    br.close()
}