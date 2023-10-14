import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val father = br.readLine().split(" ")
    val mother = br.readLine().split(" ")
    val color = father + mother
    val set = HashSet<Pair<String, String>>()

    for(i in 0 until 4){
        for(j in 0 until 4)
            set.add(Pair(color[i], color[j]))
    }

    val result = set.toSortedSet { o1, o2 ->
        if (o1.first == o2.first) {
            o1.second.compareTo(o2.second)

        } else {
            o1.first.compareTo(o2.first)
        }
    }

    result.forEach {
        bw.write("${it.first} ${it.second}\n")
    }

    bw.close()
    br.close()
}