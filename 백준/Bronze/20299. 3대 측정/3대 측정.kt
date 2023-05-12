import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k, l) = br.readLine().split(" ").map { it.toInt() }
    var count = 0
    val result = ArrayList<List<Int>>()

    repeat(n){
        val input = br.readLine().split(" ").map { it.toInt() }

        var sum = 0
        var checkIndividual = true
        input.forEach {
            sum += it

            if(it < l)
                checkIndividual = false
        }

        if(sum >= k && checkIndividual){
            result.add(input)
            count++
        }
    }

    bw.write("$count\n")
    result.forEach {
        it.forEach { v ->
            bw.write("$v ")
        }
    }

    bw.close()
    br.close()
}