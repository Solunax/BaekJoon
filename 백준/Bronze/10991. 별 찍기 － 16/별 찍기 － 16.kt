import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. n){
        for(j in i until n)
            bw.write(" ")

        for(j in 1 until 2 * i){
            if(j % 2 != 0)
                bw.write("*")
            else
                bw.write(" ")
        }

        bw.write("\n")
    }


    bw.close()
    br.close()
}