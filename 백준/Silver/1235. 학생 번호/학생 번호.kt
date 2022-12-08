import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val origin = ArrayList<String>()
    repeat(br.readLine().toInt()){
        origin.add(br.readLine())
    }

    var result = 1
    val map = HashMap<String, Int>()
    while(true){
        origin.forEach {
            val text = it.substring(it.length-result)
            if(map.containsKey(text))
                map[text] = map[text]!! + 1
            else
                map[text] = 1
        }

        var flag = true
        map.values.forEach {
            if(it > 1)
                flag = false
        }

        if(flag)
            break

        result++
        map.clear()
    }
    bw.write("$result")

    br.close()
    bw.close()
}