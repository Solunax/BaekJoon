import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c, zr, zc) = br.readLine().split(" ").map { it.toInt() }

    val original = Array(r){ Array(c){""} }
    repeat(r){
        original[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    val result = ArrayList<ArrayList<String>>()
    var rIndex = 0
    for(i in 0 until r){
        repeat(zr){
            result.add(ArrayList())
            for(j in 0 until c){
                repeat(zc){
                    result[rIndex].add(original[i][j])
                }
            }
            rIndex++
        }
    }

    result.forEach {
        it.forEach { v ->
            bw.write(v)
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}