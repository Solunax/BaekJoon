import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        br.readLine()

        val jun = br.readLine().split(" ").map{ it.toInt() }.sorted().toMutableList()
        val bee = br.readLine().split(" ").map{ it.toInt() }.sorted().toMutableList()

        if(jun.last() > bee.last())
            bw.write("S\n")
        else if(bee.last() > jun.last())
            bw.write("B\n")
        else
            bw.write("S\n")
    }

    br.close()
    bw.close()
}