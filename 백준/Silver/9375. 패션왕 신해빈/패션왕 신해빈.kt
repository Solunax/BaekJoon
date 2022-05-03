import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val case = br.readLine().toInt()

    for(i in 0 until case){
        val input = br.readLine().toInt()
        val cloth = HashMap<String, Int>()

        for(j in 0 until input){
            val type = br.readLine().split(" ")[1]
            if(cloth.containsKey(type))
                cloth[type] = cloth[type]!! + 1
            else
                cloth[type] = 1
        }
        var result = 1
        cloth.forEach { _, v ->
            result *= (v + 1)
        }

        bw.write("${result - 1}\n")
        bw.flush()
    }

    br.close()
    bw.close()
}