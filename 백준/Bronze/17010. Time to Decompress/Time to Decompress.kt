import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (n, c) = br.readLine().split(" ")

        repeat(n.toInt()){
            bw.write(c)
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}