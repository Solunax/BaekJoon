import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n + 1){0}

    val reverse = k < 3
    var index = m
    arr[m] = 3

    while (true) {
        if(arr[index] == k){
            bw.write("$index")
            break
        }

        val last = arr[index]

        if(reverse) {
            index--
            if (index == 0) {
                index = n
            }

            arr[index] = last - 1
        } else {
            index++
            if (index > n) {
                index = 1
            }

            arr[index] = last + 1
        }
    }

    bw.close()
    br.close()
}