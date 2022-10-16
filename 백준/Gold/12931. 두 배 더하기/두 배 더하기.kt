import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()
    var result = 0

    while(true){
        var zeroCount = 0

        for(i in 0 until n){
            if(array[i] % 2 != 0){
                result++
                array[i]--
            }

            if(array[i] == 0)
                zeroCount++
        }

        if(zeroCount == n)
            break

        result++
        for(i in 0 until n)
            array[i] /= 2
    }

    bw.write("$result")
    bw.close()
    br.close()
}