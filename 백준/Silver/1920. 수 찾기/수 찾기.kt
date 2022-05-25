import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Hashtable
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberCount = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    array.sort()
    val searchCount = br.readLine().toInt()
    val searchArray = br.readLine().split(" ").map { it.toInt() }

    for(i in 0 until searchCount){
        var isExist = false
        var startIndex = 0
        var endIndex = numberCount - 1

        while(startIndex <= endIndex){
            val centerIndex = (startIndex + endIndex) / 2
            if(array[centerIndex] == searchArray[i]){
                isExist = true
                break
            }else if(array[centerIndex] > searchArray[i])
                endIndex = centerIndex - 1
            else
                startIndex = centerIndex + 1
        }

        if(isExist)
            bw.write("1\n")
        else
            bw.write("0\n")
    }

    br.close()
    bw.close()
}