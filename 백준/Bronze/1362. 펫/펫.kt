import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var scenarioCount = 1
    while(true){
        var (o, w) = br.readLine().split(" ").map { it.toInt() }

        if(o == 0 && w == 0)
            break

        while (true){
            val (command, value) = br.readLine().split(" ")

            if(w > 0){
                when(command) {
                    "E" -> w -= value.toInt()
                    "F" -> w += value.toInt()
                }
            }

            if(command == "#"){
                bw.write("$scenarioCount ")
                if(w <= 0)
                    bw.write("RIP\n")
                else if(w > o * 0.5 && w < o * 2)
                    bw.write(":-)\n")
                else
                    bw.write(":-(\n")
                scenarioCount++
                break
            }
        }
    }

    bw.close()
    br.close()
}