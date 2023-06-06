import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arr = ArrayList<String>()
    val (n, l) = br.readLine().split(" ").map { it.toInt() }

    repeat(n){
        arr.add(br.readLine())
    }
    bw.write(arr.sorted()[l - 1])

    bw.close()
    br.close()
}