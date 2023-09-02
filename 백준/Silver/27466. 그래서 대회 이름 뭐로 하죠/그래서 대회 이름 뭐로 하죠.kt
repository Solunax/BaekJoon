import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val str = br.readLine().reversed()
    val check = listOf('A', 'E', 'I', 'O', 'U')

    var index = 0
    val sb = StringBuilder()

    for(i in 0 until n){
        index++

        if(str[i] !in check){
            sb.append(str[i])
            break
        }
    }

    var count = 0
    for(i in index until n){
        index++

        if(str[i] == 'A'){
            sb.append('A')
            count++

            if(count == 2)
                break
        }
    }

    for(i in index until n){
        sb.append("${str[i]}")

        if(sb.length == m){
            bw.write("YES\n")
            bw.write("${sb.reversed()}")
            break
        }
    }

    if(sb.length != m)
        bw.write("NO")

    bw.close()
    br.close()
}