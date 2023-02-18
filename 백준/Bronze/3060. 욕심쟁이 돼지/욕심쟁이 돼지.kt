import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val food = br.readLine().toLong()
        val pig = br.readLine().split(" ").map { it.toLong() }
        
        var sum = 0L
        pig.forEach {
            sum += it
        }

        var day = 1
        while (food >= sum){
            sum *= 4
            day++
        }

        bw.write("$day\n")
    }

    br.close()
    bw.close()
}