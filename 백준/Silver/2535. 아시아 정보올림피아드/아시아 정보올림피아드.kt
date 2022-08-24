import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val info = Array(n){Array(3){0}}
    val check = HashMap<Int, Int>()
    var count = 0

    repeat(n){
        info[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
        check[info[it][0]] = 0
    }

    info.sortWith{ o1, o2 ->
        o2[2] - o1[2]
    }

    for(i in 0 until n){
        if(check[info[i][0]] != 2){
            bw.write("${info[i][0]} ${info[i][1]}\n")
            check[info[i][0]] = check[info[i][0]]!! + 1
            count++
        }

        if(count == 3)
            break
    }

    bw.close()
    br.close()
}