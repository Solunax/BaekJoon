import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        if(br.readLine().length in 6 .. 9)
            bw.write("yes\n")
        else
            bw.write("no\n")
    }

    br.close()
    bw.close()
}