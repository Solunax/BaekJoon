import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    repeat(case){
        val (a, string) = br.readLine().split(" ")
        val miss = a.toInt() - 1
        for(i in string.indices){
            if(miss != i)
                bw.write("${string[i]}")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}