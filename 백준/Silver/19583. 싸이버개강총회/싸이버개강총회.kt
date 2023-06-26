import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val time = br.readLine().split(" ")
    val inLog = HashSet<String>()
    val outLog = HashSet<String>()

    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        val (logTime, name) = input.split(" ")

        if(logTime <= time[0])
            inLog.add(name)
        else if(logTime in time[1] .. time[2])
            outLog.add(name)
    }

    var count = 0
    for(i in inLog){
        if(outLog.contains(i))
            count++
    }
    bw.write("$count")

    bw.close()
    br.close()
}