import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val(doughPrice, toppingPrice) = br.readLine().split(" ").map{ it.toInt() }
    val doughCal = br.readLine().toInt()
    val calArray = Array(n){0}

    repeat(n){
        calArray[it] = br.readLine().toInt()
    }
    calArray.sortDescending()

    var result = doughCal / doughPrice
    var price = doughPrice
    var cal = doughCal

    for(i in 0 until n){
        price += toppingPrice
        cal += calArray[i]

        val tempResult = cal / price
        if(result > tempResult)
            break
        else
            result = tempResult
    }

    bw.write("$result")

    bw.close()
    br.close()
}