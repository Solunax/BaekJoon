import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val nameSet = HashSet<String>()
    val duplicate = LinkedList<String>()

    for(i in 0 until n)
        nameSet.add(br.readLine())

    for(i in 0 until m){
        val input = br.readLine()
        if(nameSet.contains(input))
            duplicate.add(input)
    }

    bw.write("${duplicate.size}\n")
    duplicate.sort()

    duplicate.forEach {
        bw.write(it +"\n")
    }

    br.close()
    bw.close()
}