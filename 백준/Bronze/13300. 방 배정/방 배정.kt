import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
   val (n, k) = br.readLine().split(" ").map{ it.toInt() }
    val man = Array(7){0}
    val woman = Array(7){0}

    repeat(n){
        val (s, y) = br.readLine().split(" ").map { it.toInt() }

        when(s){
            0 -> woman[y]++
            1 -> man[y]++
        }
    }

    var result = 0

    man.forEach {
        result += if(it % k != 0)
            it / k + 1
        else
            it / k
    }

    woman.forEach {
        result += if(it % k != 0)
            it / k + 1
        else
            it / k
    }
    bw.write("$result")

    bw.close()
    br.close()
}