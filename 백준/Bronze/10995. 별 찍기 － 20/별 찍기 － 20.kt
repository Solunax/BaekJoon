import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 0 until n){
        val check = i % 2
        for(j in 0 until n){
            if(check == 0)
                bw.write("* ")
            else
                bw.write(" *")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}