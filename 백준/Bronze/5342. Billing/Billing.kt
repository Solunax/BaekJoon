import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var cost = 0.0
    val supplies = HashMap<String, Double>()
    supplies["Paper"] = 57.99
    supplies["Printer"] = 120.50
    supplies["Planners"] = 31.25
    supplies["Binders"] = 22.50
    supplies["Calendar"] = 10.95
    supplies["Notebooks"] = 11.20
    supplies["Ink"] = 66.95

    while (true) {
        val str = br.readLine()

        if (str == "EOI") {
            break
        }

        cost += supplies[str]!!
    }
    bw.write("$$cost")

    bw.close()
    br.close()
}