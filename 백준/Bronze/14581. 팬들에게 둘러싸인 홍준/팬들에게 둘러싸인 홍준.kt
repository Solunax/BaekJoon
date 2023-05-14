import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    for(i in 0 until 3){
        for(j in 0 until 3){
            if(i == 1 && j == 1)
                bw.write(":$input:")
            else
                bw.write(":fan:")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}