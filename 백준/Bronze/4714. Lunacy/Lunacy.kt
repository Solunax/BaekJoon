import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val input = br.readLine().toDouble()

        if(input < 0)
            break

        bw.write("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n".format(input, input * 0.167))
    }

    bw.close()
    br.close()
}