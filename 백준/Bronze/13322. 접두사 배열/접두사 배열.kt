import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().length){
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}