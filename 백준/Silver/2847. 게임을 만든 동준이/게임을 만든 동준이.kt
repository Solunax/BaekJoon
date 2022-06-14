import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfLevels = br.readLine().toInt()
    val levels = Array(numberOfLevels){0}

    for(i in 0 until numberOfLevels)
        levels[i] = br.readLine().toInt()

    var result = 0
    for(i in numberOfLevels - 2 downTo 0){
        if(levels[i] >= levels[i + 1]){
            val value = levels[i] - levels[i + 1] + 1
            result += value
            levels[i] -= value
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}
