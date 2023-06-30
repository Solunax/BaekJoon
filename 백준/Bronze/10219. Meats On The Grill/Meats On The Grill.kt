import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val (r, c) = br.readLine().split(" ").map { it.toInt() }
        val meat = Array(r){ Array(c){" "} }

        repeat(r){
            meat[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
        }

        meat.forEach { arr ->
            arr.reversed().forEach { v ->
                bw.write(v)
            }
            bw.write("\n")
        }
    }

    bw.close()
    br.close()
}