import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toInt()

    when(input % 2){
        0 -> bw.write("I LOVE CBNU")
        1 -> {
            for(i in 0 until input)
                bw.write("*")

            bw.write("\n")

            val n = input / 2 + 1
            var left = n
            var right = n
            for(i in 0 until n){
                for(j in 0 until left){
                    if(j == left - 1)
                        bw.write("*")
                    else
                        bw.write(" ")
                }

                for(j in left until right){
                    if(j == right - 1)
                        bw.write("*")
                    else
                        bw.write(" ")
                }
                bw.write("\n")

                left -= 1
                right += 1
            }
        }
    }

    bw.close()
    br.close()
}