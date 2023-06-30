import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()

        if((n and -n) == n)
            bw.write("1\n")
        else
            bw.write("0\n")
    }

    bw.close()
    br.close()
}