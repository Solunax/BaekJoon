import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = ArrayList<Int>()

    repeat(n){
        arr.add(it + 1)
    }

    while (arr.size > 1){
        val len = arr.size

        for(i in len downTo 1){
            if(i % 2 == 1)
                arr.removeAt(i - 1)
        }
    }

    bw.write("${arr[0]}")


    bw.close()
    br.close()
}