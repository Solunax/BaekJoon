import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (cut, m) = br.readLine().split(" ").map { it.toInt() }
    val map = HashMap<String, Int>()

    repeat(m){
        map[br.readLine()] = it
    }

    val inputList = map.toList().sortedBy { it.second }
    if(inputList.size < cut){
        inputList.forEach {
            bw.write("${it.first}\n")
        }
    }else{
        for(i in 0 until cut)
            bw.write("${inputList[i].first}\n")
    }


    br.close()
    bw.close()
}