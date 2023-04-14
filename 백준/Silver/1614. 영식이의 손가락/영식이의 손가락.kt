import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val hurt = br.readLine().toLong()
    val possible = br.readLine().toLong()
    var result = hurt - 1

    if(possible > 0){
        result += if(hurt % 4 == 1L)
             8 * possible
        else
            (possible / 2 * 8) + (possible % 2 * (8 - (hurt - 1) * 2))
    }

    bw.write("$result")

    bw.close()
    br.close()
}