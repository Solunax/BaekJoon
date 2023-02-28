import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0
    repeat(br.readLine().toInt()){
        val dice = Array(7){0}

        br.readLine().split(" ").map { it.toInt() }.forEach{
            dice[it]++
        }

        var fourCheck = false
        var threeCheck = false
        var doubleCheck = 0
        var maxDice = 0
        val doubleArr = ArrayList<Int>()
        for(i in 1 .. 6){
            if(dice[i] != 0)
                maxDice = i

            if(dice[i] == 4)
                fourCheck = true
            else if(dice[i] == 3)
                threeCheck = true

            if(dice[i] == 2){
                doubleCheck++
                doubleArr.add(i)
            }
        }

        result = if(fourCheck)
            max(result, 50000 + (dice.indexOf(4) * 5000))
        else if(threeCheck)
            max(result, 10000 + (dice.indexOf(3) * 1000))
        else if(doubleCheck == 2)
            max(result, 2000 + (doubleArr[0] * 500) + (doubleArr[1] * 500))
        else if(doubleCheck == 1)
            max(result, 1000 + (doubleArr[0] * 100))
        else
            max(result, maxDice * 100)
    }
    bw.write("$result")

    br.close()
    bw.close()
}