import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine().split(" ").map{ it.toInt() }

    bw.write("${factorial(input[0]) / (factorial(input[1]) * factorial(input[0] - input[1]))}")

    bw.flush()
    br.close()
    bw.close()
}

fun factorial(num:Int):Int{
    var result = 1
    for(i in 1..num)
        result *= i

    return result
}