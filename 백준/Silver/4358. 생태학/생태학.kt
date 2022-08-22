import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val trees = HashMap<String, Int>()
    var total = 0
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        total++
        if(!trees.containsKey(input))
            trees[input] = 1
        else
            trees[input] = trees[input]!! + 1
    }

    trees.toSortedMap().forEach { (name, value) ->
        bw.write("$name ${String.format("%.4f", value.toDouble()/total * 100)}\n")
    }

    bw.close()
    br.close()
}