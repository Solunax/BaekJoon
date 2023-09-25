import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (m, n, multiply) = br.readLine().split(" ").map{ it.toInt() }

    repeat(m){
        val line = br.readLine()

        for(i in 0 until multiply){
            for(j in 0 until n){
                repeat(multiply){
                    bw.write("${line[j]}")
                }
            }
            bw.write("\n")
        }
    }

    bw.close()
    br.close()
}