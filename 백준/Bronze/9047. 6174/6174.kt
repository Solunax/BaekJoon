import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var count = 0
        var n = br.readLine()

        while(n != "6174"){
            val temp = n.toCharArray()
            val v1 = temp.sortedDescending().joinToString("")
            val v2 = temp.sorted().joinToString("")

            n = (v1.toInt() - v2.toInt()).toString()

            if(n.length < 4){
                for(i in 0 until 4 - n.length)
                    n += "0"
            }

            count++
        }

        bw.write("$count\n")
    }

    br.close()
    bw.close()
}