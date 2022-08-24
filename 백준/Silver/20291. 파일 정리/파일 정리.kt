import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val file = HashMap<String, Int>()

    repeat(n){
        val info = br.readLine().split(".")
        if(file.containsKey(info[1]))
            file[info[1]] = file[info[1]]!! + 1
        else
            file[info[1]] = 1
    }

    file.toSortedMap().forEach {
        bw.write("${it.key} ${it.value}\n")
    }

    bw.close()
    br.close()
}