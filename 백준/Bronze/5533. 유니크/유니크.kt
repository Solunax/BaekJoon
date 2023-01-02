import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = Array(n){Array(3){0}}

    repeat(n){
        num[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    val result = Array(n){0}
    for(i in 0 until 3){
        val numbers = ArrayList<Int>()

        for(j in 0 until n)
            numbers.add(num[j][i])

        for(j in 0 until n){
            if(numbers.count { it == numbers[j] } == 1)
                result[j] += numbers[j]
        }
    }

    result.forEach {
        bw.write("$it\n")
    }

    br.close()
    bw.close()
}