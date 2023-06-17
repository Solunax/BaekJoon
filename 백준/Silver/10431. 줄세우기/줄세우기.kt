import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map{ v -> v.toInt() }.toMutableList()
        input.removeFirst()

        val tall = ArrayList<Int>()
        var result = 0

        tall.add(input[0])
        for(i in 1 until input.size){
            var count = 0
            if(tall[i - 1] > input[i]){
                for(j in i - 1 downTo 0){
                    if(tall[j] > input[i])
                        count++
                }
                tall.add(i - count, input[i])
            }else
                tall.add(input[i])

            result += count
        }

        bw.write("${it + 1} $result\n")
    }

    bw.close()
    br.close()
}