import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val start = br.readLine().toInt()
    val end = br.readLine().toInt()

    for (year in start..end step 60) {
        bw.write("All positions change in year $year\n")
    }

    bw.close()
    br.close()
}