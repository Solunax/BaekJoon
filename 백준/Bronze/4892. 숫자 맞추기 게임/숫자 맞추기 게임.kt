import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var index = 1
    while (true){
        val check : Boolean
        val n0 = br.readLine().toInt()

        if(n0 == 0)
            break

        val n1 = n0 * 3

        val n2 = if(n1 % 2 == 0){
            check = true
            n1 / 2
        } else{
            check = false
            (n1 + 1) / 2
        }

        val n3 = n2 * 3
        val n4 = n3 / 9

        bw.write("${index++}. ")
        if(check)
            bw.write("even ")
        else
            bw.write("odd ")
        bw.write("$n4\n")
    }

    bw.close()
    br.close()
}