import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfCase = br.readLine().toInt()
    val coins = arrayOf(25, 10, 5, 1)
    for(i in 0 until numberOfCase){
        var money = br.readLine().toInt()
        val change = Array(4){0}

        var index = 0
        while(money > 0){
            if(money / coins[index] != 0){
                change[index] += (money / coins[index])
                money %= coins[index]
            }else
                index++
        }

        bw.write("${change[0]} ${change[1]} ${change[2]} ${change[3]}\n")
    }

    bw.close()
    br.close()
}
