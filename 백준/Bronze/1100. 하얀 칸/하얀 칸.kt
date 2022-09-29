import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val even = listOf("W", "B", "W", "B", "W", "B", "W", "B")
    val odd = listOf("B", "W", "B", "W", "B", "W", "B", "W")
    val array = ArrayList<List<String>>()

    repeat(8){
        array.add(br.readLine().split("").filter { it.isNotEmpty() })
    }

    var result = 0
    for(i in 0 until array.size){
        result += if(i % 2 == 0)
            countF(even, array[i])
        else
            countF(odd, array[i])
    }

    bw.write("$result")
    bw.close()
    br.close()
}

fun countF(list : List<String>, map : List<String>) : Int{
    var count = 0
    for(j in 0 until 8){
        if(list[j] == "W" && map[j] == "F")
            count++
    }
    return count
}