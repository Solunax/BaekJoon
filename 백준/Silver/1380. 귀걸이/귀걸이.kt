import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 0
    while(true){
        val n = br.readLine().toInt()

        if(n == 0)
            break
        count++

        val name = Array(n){""}
        repeat(n){
            name[it] = br.readLine()
        }

        val check = HashSet<Int>()
        repeat(2 * n - 1){
            val input = br.readLine().split(" ")[0].toInt()
            if(check.contains(input))
                check.remove(input)
            else
                check.add(input)
        }

        bw.write("$count ${name[check.first()-1]}\n")
    }

    br.close()
    bw.close()
}