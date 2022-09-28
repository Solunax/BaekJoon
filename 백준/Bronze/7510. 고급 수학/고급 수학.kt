import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        bw.write("Scenario #${it+1}:\n")
        val (a, b, c) = br.readLine().split(" ").map { v -> v.toLong() }.sorted()

        if(c*c == a*a + b*b)
            bw.write("yes\n")
        else
            bw.write("no\n")
        bw.write("\n")
    }

    bw.close()
    br.close()
}