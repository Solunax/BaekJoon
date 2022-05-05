import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val values = Array(41){ Array(2) {0} }

fun main() {
    values[0][0] = 1
    values[0][1] = 0
    values[1][0] = 0
    values[1][1] = 1

    val case = br.readLine().toInt()

    for(i in 0 until case){
        val number = br.readLine().toInt()
        fibonacci(number)
        bw.write("${values[number][0]} ${values[number][1]}\n")
        bw.flush()
    }

    br.close()
    bw.close()
}

fun fibonacci(n:Int): Array<Int> {
    if (values[n][0] == 0 && values[n][1] == 0) {
        values[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0]
        values[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1]
    }

    return values[n]
}