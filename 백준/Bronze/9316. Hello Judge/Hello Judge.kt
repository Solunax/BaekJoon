import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        bw.write("Hello World, Judge ${it + 1}!\n")
    }

    bw.close()
    br.close()
}
