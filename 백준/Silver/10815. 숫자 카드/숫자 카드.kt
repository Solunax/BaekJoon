import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfCards = br.readLine().toInt()
    val cardArray = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    cardArray.sort()

    val case = br.readLine().toInt()
    val caseNumber = br.readLine().split(" ").map { it.toInt() }

    for(i in 0 until case){
        var startIndex = 0
        var endIndex = numberOfCards - 1
        var flag = false

        while(startIndex <= endIndex){
            val centerIndex = (startIndex + endIndex) / 2

            if(cardArray[centerIndex] == caseNumber[i]){
                flag = true
                break
            }else if(cardArray[centerIndex] > caseNumber[i])
                endIndex = centerIndex - 1
            else
                startIndex = centerIndex + 1
        }

        if(flag)
            bw.write("1 ")
        else
            bw.write("0 ")
    }

    br.close()
    bw.close()
}