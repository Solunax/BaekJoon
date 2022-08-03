import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().reversed()
    val array = ArrayList<String>()

    var start = 0
    val maxLength = input.length - 1
    while (true){
        if(start +2 < maxLength)
            array.add(input.slice(start .. start + 2).reversed())
        else{
            array.add(input.slice(start .. maxLength).reversed())
            break
        }
        start += 3
    }
    array.reverse()

    array.forEach {
        when (it.length) {
            3 -> {
                bw.write("${(it[0] - '0') * 4 + (it[1] - '0') * 2 + (it[2] - '0') * 1}")
            }
            2 -> {
                bw.write("${(it[0] - '0') * 2 + (it[1] - '0') * 1}")
            }
            else -> bw.write("${it[0] - '0'}")
        }
    }

    bw.close()
    br.close()
}
