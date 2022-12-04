import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    
    repeat(n){
        bw.write("${br.readLine().reversed()}\n")
    }

    br.close()
    bw.close()
}