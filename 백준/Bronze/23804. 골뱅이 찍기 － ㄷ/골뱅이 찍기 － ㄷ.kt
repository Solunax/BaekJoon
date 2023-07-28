import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n * 5){
        if(i in 1 .. n || i in n * 5 - n + 1 .. n * 5) {
            repeat(5 * n) {
                bw.write("@")
            }
        }else{
            repeat(n) {
                bw.write("@")
            }
        }

        bw.write("\n")
    }

    bw.close()
    br.close()
}