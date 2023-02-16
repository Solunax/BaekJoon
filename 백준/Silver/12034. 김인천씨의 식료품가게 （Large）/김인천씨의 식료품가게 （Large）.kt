import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        val price = br.readLine().split(" ").map { v -> v.toInt() }.toMutableList()
        val result = ArrayList<Int>()

        while (price.size > 0){
            val sale = (price.last() * 0.75).toInt()

            result.add(sale)
            price.removeLast()
            price.remove(sale)
        }

        bw.write("Case #${it + 1}: ")
        for(i in result.size-1 downTo 0)
            bw.write("${result[i]} ")
        bw.write("\n")
    }


    br.close()
    bw.close()
}