import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n * 5){
        when(i){
            in 1 .. n -> {
                repeat(n * 5) {
                    when(it + 1){
                        in n * 3 + 1..n * 4 -> bw.write(" ")
                        else -> bw.write("@")
                    }
                }
            }
            in n * 4 + 1 .. n * 5 -> {
                repeat(n * 5) {
                    when(it + 1){
                        in n + 1..n * 2 -> bw.write(" ")
                        else -> bw.write("@")
                    }
                }
            }
            else -> {
                repeat(n * 5){
                    when(it + 1){
                        in n + 1 .. n * 2 -> bw.write(" ")
                        in n * 3 + 1 .. n * 4 -> bw.write(" ")
                        else -> bw.write("@")
                    }
                }
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}