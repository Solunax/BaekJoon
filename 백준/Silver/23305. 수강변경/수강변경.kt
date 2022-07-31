import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(1000001){0}

    br.readLine().split(" ").map { it.toInt() }.forEach {
        array[it]++
    }

    var result = 0
    br.readLine().split(" ").map{ it.toInt() }.forEach {
        if(array[it] >= 1)
            array[it]--
        else
            result += 1
    }

    bw.write("$result")

    bw.close()
    br.close()
}