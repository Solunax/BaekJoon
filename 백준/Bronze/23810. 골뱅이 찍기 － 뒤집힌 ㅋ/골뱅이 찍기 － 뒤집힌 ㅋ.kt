import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 0 until 5 * n){
        when(i){
            in 0 until n -> {
                repeat(5 * n) {
                    bw.write("@")
                }
            }
            in 2 * n until 3 * n -> {
                repeat(5 * n) {
                    bw.write("@")
                }
            }
            else ->{
                repeat(n) {
                    bw.write("@")
                }
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}