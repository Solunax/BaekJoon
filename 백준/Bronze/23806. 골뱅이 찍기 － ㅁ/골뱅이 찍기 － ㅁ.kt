import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    for(i in 1 .. 5 * n){
        if(i in 1 .. n || i in 5 * n - n + 1 .. 5 * n){
            repeat(5 * n){
                bw.write("@")
            }
        }else{
            for(j in 1 .. 5 * n){
                if(j in 1 .. n || j in 5 * n - n + 1 .. 5 * n)
                    bw.write("@")
                else
                    bw.write(" ")
            }
        }

        bw.write("\n")
    }

    bw.close()
    br.close()
}