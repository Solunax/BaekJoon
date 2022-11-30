import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var total = br.readLine().toInt()

    repeat(9){
        total -= br.readLine().toInt()
    }

    bw.write("$total")

    bw.close()
    br.close()
}