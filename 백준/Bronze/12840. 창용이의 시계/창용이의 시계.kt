import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var now = input[0] * 3600 + input[1] * 60 + input[2]

    repeat(br.readLine().toInt()){
        val command = br.readLine().split(" ").map { it.toInt() }

        when(command[0]){
            1 -> now = (now + command[1]) % 86400
            2 -> {
                now = (now - command[1]) % 86400
                while (now < 0){
                    now += 86400
                }
            }
            3 -> bw.write("${now / 3600} ${now % 3600 / 60} ${now % 60}\n")
        }
    }

    bw.close()
    br.close()
}