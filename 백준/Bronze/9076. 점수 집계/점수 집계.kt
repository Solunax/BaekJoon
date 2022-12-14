import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { it.toInt() }.sorted().toMutableList()
        input.removeFirst()
        input.removeLast()

        if(input.last() - input.first() >= 4)
            bw.write("KIN\n")
        else{
            var sum = 0
            input.forEach {
                sum += it
            }
            bw.write("$sum\n")
        }
    }

    br.close()
    bw.close()
}