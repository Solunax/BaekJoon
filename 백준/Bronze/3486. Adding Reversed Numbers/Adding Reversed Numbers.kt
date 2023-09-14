import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ")

        val v1 = StringBuilder()
        val v2 = StringBuilder()

        a.reversed().forEach {
            v1.append(it)
        }

        b.reversed().forEach {
            v2.append(it)
        }

        bw.write("${(v1.toString().toInt() + v2.toString().toInt()).toString().reversed().toInt()}\n")
    }

    bw.close()
    br.close()
}