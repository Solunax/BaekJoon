import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0L
    var xorSum = 0L

    repeat(br.readLine().toInt()) {
        val command = br.readLine().split(" ")

        when (command[0]) {
            "1" -> {
                sum += command[1].toLong()
                xorSum = xorSum xor command[1].toLong()
            }
            "2" -> {
                sum -= command[1].toLong()
                xorSum = xorSum xor command[1].toLong()
            }
            "3" -> bw.write("$sum\n")
            "4" -> bw.write("$xorSum\n")
        }
    }

    bw.close()
    br.close()
}