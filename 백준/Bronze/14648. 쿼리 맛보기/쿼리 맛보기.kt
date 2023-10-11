import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    repeat(q){
        val query = br.readLine().split(" ").map { it.toInt() - 1 }

        when(query[0] + 1){
            1 -> {
                var sum = 0L
                for(i in query[1] .. query[2])
                    sum += arr[i]

                bw.write("$sum\n")
                arr[query[1]] = arr[query[2]].also {arr[query[2]] = arr[query[1]]}
            }
            2 ->{
                var sum1 = 0L
                var sum2 = 0L

                for(i in query[1] .. query[2])
                    sum1 += arr[i]

                for(i in query[3] .. query[4])
                    sum2 += arr[i]

                bw.write("${sum1 - sum2}\n")
            }
        }
    }

    bw.close()
    br.close()
}