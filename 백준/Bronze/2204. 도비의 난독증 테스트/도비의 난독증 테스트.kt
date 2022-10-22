import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val case = br.readLine().toInt()

        if(case == 0)
            break

        val array = Array(case){""}
        repeat(case){
            array[it] = br.readLine()
        }

        array.sortWith{ o1, o2 ->
            o1.lowercase().compareTo(o2.lowercase())
        }
        
        bw.write("${array[0]}\n")
    }

    bw.close()
    br.close()
}