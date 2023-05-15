import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var num = br.readLine().toInt()
    val nine = ArrayList<Int>()

    while(num >= 9){
        nine.add(num % 9)
        num /= 9
    }
    nine.add(num)

    nine.reversed().forEach {
        bw.write("$it")
    }

    bw.close()
    br.close()
}