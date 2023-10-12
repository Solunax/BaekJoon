import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val separator = HashSet<String>()

    repeat(2){
        br.readLine()
        br.readLine().split(" ").forEach {
            separator.add(it)
        }
    }

    br.readLine()
    br.readLine().split(" ").forEach {
        separator.remove(it)
    }

    br.readLine()
    val str = br.readLine()
    var lineCheck = false
    for(c in str){
        if(c == ' ' || separator.contains(c.toString())){
            if(lineCheck){
                bw.write("\n")
                lineCheck = false
            }
            continue
        }

        bw.write("$c")
        lineCheck = true
    }

    bw.close()
    br.close()
}