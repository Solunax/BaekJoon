import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val start = br.readLine().split("").filter { it.isNotEmpty() }
        val want = br.readLine().split("").filter { it.isNotEmpty() }

        var blackCount = 0
        var whiteCount = 0

        for(i in 0 until n){
            if(start[i] != want[i]){
                if(start[i] == "W")
                    whiteCount++
                else
                    blackCount++
            }
        }

        bw.write("${max(whiteCount, blackCount)}\n")
    }

    bw.close()
    br.close()
}