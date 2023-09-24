import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val x = br.readLine().replace(" ", "").toInt()
        val y = br.readLine().replace(" ", "").toInt()
        val spinnerInput = br.readLine().replace(" ", "")
        val spinner = spinnerInput.split("").filter { it.isNotEmpty() }.map { it.toInt() } +
                spinnerInput.substring(0, m).split("").filter { it.isNotEmpty() }.map { it.toInt() }
        var result = 0
        val sb = StringBuilder()

        for(i in 0 until n){
            repeat(m){
                sb.append(spinner[i + it])
            }

            if(sb.toString().toInt() in x .. y)
                result++

            sb.clear()
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}