import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 ..  n * 5){
        when(i){
            in n + 1 .. 2 * n -> {
                repeat(n * 5){
                    bw.write("@")
                }
            }

            in 3 * n + 1 .. 4 * n -> {
                repeat(n * 5){
                    bw.write("@")
                }
            }

            else -> {
                repeat(n){
                    bw.write("@")
                }
                repeat(n * 5 - n * 2){
                    bw.write(" ")
                }

                repeat(n){
                    bw.write("@")
                }
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}