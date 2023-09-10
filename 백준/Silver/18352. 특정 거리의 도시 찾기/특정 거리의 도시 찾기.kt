import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()


fun main() {
    val (n, m, k, x) = br.readLine().split(" ").map { it.toInt() }

    val road = Array(n + 1){ ArrayList<Int>() }
    repeat(m){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        road[v1].add(v2)
    }

    val dist = Array(n + 1){ -1 }
    val queue = LinkedList<Int>()
    val result = ArrayList<Int>()

    queue.add(x)
    dist[x] = 0

    while (queue.isNotEmpty()){
        val now = queue.poll()

        if(dist[now] > k)
            break

        if(dist[now] == k)
            result.add(now)

        for(next in road[now]){
            if(dist[next] == -1){
                dist[next] = dist[now] + 1
                queue.add(next)
            }
        }
    }

    if(result.isNotEmpty()){
        result.sorted().forEach {
            bw.write("$it\n")
        }
    }else
        bw.write("-1")


    bw.close()
    br.close()
}