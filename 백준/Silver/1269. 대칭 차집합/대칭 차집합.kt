import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Hashtable
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val array1 = br.readLine().split(" ").map { it.toInt() }
    val array2 = br.readLine().split(" ").map { it.toInt() }
    val hashSet = HashSet<Int>()

    array1.forEach {
        hashSet.add(it)
    }

    array2.forEach {
        hashSet.add(it)
    }

    bw.write("${(hashSet.size - n) + (hashSet.size - m)}")

    br.close()
    bw.close()
}