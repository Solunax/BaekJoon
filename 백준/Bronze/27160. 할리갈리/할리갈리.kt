import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val card = HashMap<String, Int>()

    repeat(n){
        val (fruit, amount) = br.readLine().split(" ")

        if(card.containsKey(fruit))
            card[fruit] = card[fruit]!! + amount.toInt()
        else
            card[fruit] = amount.toInt()
    }

    var flag = false
    card.forEach { (_, value) ->
        if(value == 5)
            flag = true
    }

    if(flag)
        bw.write("YES")
    else
        bw.write("NO")

    bw.close()
    br.close()
}