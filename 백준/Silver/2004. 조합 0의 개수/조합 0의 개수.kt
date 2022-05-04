import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Long.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var input = br.readLine().split(" ").map { it.toLong() }

    val fiveZero = five(input[0]) - five(input[0] - input[1]) - five(input[1])
    val twoZero = two(input[0]) - two(input[0] - input[1]) - two(input[1])

    bw.write("${min(fiveZero, twoZero)}")

    bw.flush()
    br.close()
    bw.close()
}

fun five(num:Long):Long{
    var count = 0L
    var number = num

    while(number >= 5){
        count += number / 5
        number /= 5
    }

    return count
}

fun two(num:Long):Long{
    var count = 0L
    var number = num

    while(number >= 2){
        count += number / 2
        number /= 2
    }

    return count
}