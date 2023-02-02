import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (n, b) = br.readLine().split(" ").map { it.toInt() }
    val result = ArrayList<Char>()
    var temp : Int

    while(n != 0){
        temp = n % b
        if(temp < 10)
            result.add(temp.toChar() + '0'.code)
        else
            result.add(temp.toChar() - 10 + 'A'.code)

        n /= b
    }

    for(i in result.size-1 downTo 0)
        bw.write("${result[i]}")


    br.close()
    bw.close()
}