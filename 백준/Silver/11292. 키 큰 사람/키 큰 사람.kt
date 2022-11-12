import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true){
        val case = br.readLine().toInt()

        if(case == 0)
            break

        val info = Array(case){ Pair("", 0.0)}
        var maxTall = 0.0

        repeat(case){
            val (name, tall) = br.readLine().split(" ")
            maxTall = max(maxTall, tall.toDouble())
            info[it] = Pair(name, tall.toDouble())
        }


        for(person in info){
            if(maxTall == person.second)
                bw.write("${person.first} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

