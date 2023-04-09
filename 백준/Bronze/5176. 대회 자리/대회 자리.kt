import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val set = HashSet<Int>()
        val (p, _) = br.readLine().split(" ").map { it.toInt() }
        var result = 0

        repeat(p){
            val input = br.readLine().toInt()

            if(set.contains(input))
                result++
            else
                set.add(input)
        }

        bw.write("$result\n")
    }


    br.close()
    bw.close()
}