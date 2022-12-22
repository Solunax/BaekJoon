import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    br.readLine().split("(^0^)").forEach {
        bw.write("${it.count { v -> v == '@' }} ")
    }

    bw.close()
    br.close()
}