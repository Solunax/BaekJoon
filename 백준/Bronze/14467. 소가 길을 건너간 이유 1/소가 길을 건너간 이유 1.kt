import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val cow = HashMap<Int, Int>()
    var result = 0

    repeat(n){
        val (name, location) = br.readLine().split(" ").map { it.toInt() }

        if(cow.containsKey(name)){
            if(cow[name] != location){
                result++
                cow[name] = location
            }
        }else
            cow[name] = location
    }

    bw.write("$result")

    br.close()
    bw.close()
}