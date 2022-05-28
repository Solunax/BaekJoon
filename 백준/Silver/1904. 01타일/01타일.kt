import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    bw.write("${tiles(n)}")

    br.close()
    bw.close()
}

fun tiles(number:Int):Int{
    if(number == 1)
        return 1
    if(number == 2)
        return 2

    var value1 = 1
    var value2 = 2

    for(i in 2 until number){
        val sum = (value1 + value2) % 15746
        value1 = value2
        value2 = sum
    }

    return value2
}