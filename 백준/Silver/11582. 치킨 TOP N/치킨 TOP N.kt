import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val values = br.readLine().split(" ").map { it.toInt() }
    val peopleCount = br.readLine().toInt()

    val each = n / peopleCount

    val result = ArrayList<List<Int>>()

    var index = 0
    while(index < values.size){
        val array = ArrayList<Int>()

        for(i in index until index+each)
            array.add(values[i])

        result.add(array.sorted())
        index += each
    }

    result.forEach {
        it.forEach { v ->
            bw.write("$v ")
        }
    }

    bw.close()
    br.close()
}