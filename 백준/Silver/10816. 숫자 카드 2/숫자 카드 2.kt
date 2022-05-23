import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfCards = br.readLine().toInt()
    val cardsArray = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val counting = HashMap<Int, Int>()

    for(i in 0 until numberOfCards){
        val number = cardsArray[i]
        if(counting[number] == null){
            counting[cardsArray[i]] = 1
        }else
            counting[number] = counting[number]!! + 1
    }

    val numberOfWants = br.readLine().toInt()
    val wantArray = br.readLine().split(" ").map{ it.toInt()}

    wantArray.forEach {
        if(counting[it] != null)
            bw.write("${counting[it]} ")
        else
            bw.write("0 ")
    }

    br.close()
    bw.close()
}