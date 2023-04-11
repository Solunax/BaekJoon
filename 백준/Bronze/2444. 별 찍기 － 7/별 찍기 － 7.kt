import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n){
        for(j in i until n)
            bw.write(" ")

        for(j in 0 until 2 * i - 1)
            bw.write("*")

        bw.write("\n")
    }

    for(i in n - 1 downTo 1){
        for(j in i until n)
            bw.write(" ")

        for(j in 0 until 2 * i - 1)
            bw.write("*")

        bw.write("\n")
    }


    bw.close()
    br.close()
}