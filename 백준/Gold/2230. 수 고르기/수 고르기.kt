import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val array = ArrayList<Int>()
    var result = Int.MAX_VALUE

    repeat(n){
        array.add(br.readLine().toInt())
    }

    array.sort()

    var left = 0
    var right = 0

    while(right < array.size){
        val dif = array[right] - array[left]

        if(dif < m){
            right++
            continue
        }

        if(dif == m){
            result = m
            break
        }

        result = min(result, dif)

        left++
    }

    bw.write("$result")
    bw.close()
    br.close()
}