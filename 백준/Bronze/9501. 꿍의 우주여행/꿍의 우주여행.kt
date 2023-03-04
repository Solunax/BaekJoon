import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (n, d) = br.readLine().split(" ").map { it.toInt() }
        var result = 0

        repeat(n){
            val (v, f, c) = br.readLine().split(" ").map { it.toDouble() }

            if(v * (f / c) >= d)
                result++
        }

        bw.write("$result\n")
    }

    br.close()
    bw.close()
}