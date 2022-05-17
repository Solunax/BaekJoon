import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (coinCount, money) = br.readLine().split(" ").map{ it.toInt() }
    val coinType = ArrayList<Int>()

    for(i in 0 until coinCount)
        coinType.add(br.readLine().toInt())

    var index = coinType.size - 1
    var result = 0

    while(money > 0){
        if(money / coinType[index] != 0){
            result += money / coinType[index]
            money %= coinType[index]
        }
        index--
    }
    bw.write("$result")

    br.close()
    bw.close()
}