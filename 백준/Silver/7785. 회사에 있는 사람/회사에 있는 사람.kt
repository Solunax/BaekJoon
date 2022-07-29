import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections
import java.util.PriorityQueue
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = HashMap<String, String>()

    repeat(n){
        val (name, log) = br.readLine().split(" ")
        if(log == "enter")
            map[name] = log
        if(log == "leave" && map.containsKey(name))
            map.remove(name)
    }

    val list = map.keys
    list.sortedDescending().forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}