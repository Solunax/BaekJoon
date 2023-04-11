import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n){
        for(j in 0 until i)
            bw.write("*")

        bw.write("\n")
    }

    for(i in n - 1 downTo 1){
        for(j in 0 until i)
            bw.write("*")

        bw.write("\n")
    }

    br.close()
    bw.close()
}