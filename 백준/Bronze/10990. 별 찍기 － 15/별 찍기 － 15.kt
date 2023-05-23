import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n){
        repeat(n - i){
            bw.write(" ")
        }
        bw.write("*")

        repeat(i * 2 - 3){
            bw.write(" ")
        }

        if(i == 1)
            bw.write("\n")
        else
            bw.write("*\n")
    }

    bw.close()
    br.close()
}