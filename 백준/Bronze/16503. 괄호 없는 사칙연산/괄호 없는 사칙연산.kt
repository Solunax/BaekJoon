import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ")

    var result1 = calculate(input[0].toInt(), input[2].toInt(), input[1])
    result1 = calculate(result1, input[4].toInt(), input[3])

    var result2 = calculate(input[2].toInt(), input[4].toInt(), input[3])
    result2 = calculate(input[0].toInt(), result2, input[1])

    if(result1 < result2)
        bw.write("$result1\n$result2")
    else
        bw.write("$result2\n$result1")

    bw.close()
    br.close()
}

fun calculate(n1 : Int, n2 : Int, op : String) : Int{
    when(op){
        "+" -> return n1 + n2
        "-" -> return n1 - n2
        "*" -> return n1 * n2
        "/" -> return n1 / n2
    }

    return 0
}