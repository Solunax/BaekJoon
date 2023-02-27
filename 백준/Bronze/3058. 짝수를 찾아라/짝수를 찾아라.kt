import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var min = Int.MAX_VALUE
        var even = 0

        br.readLine().split(" ").map{ it.toInt() }.forEach {
            if(it % 2 == 0){
                even += it

                if(it < min)
                    min = it
            }
        }

        bw.write("$even $min\n")
    }

    br.close()
    bw.close()
}