import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr : Array<ArrayList<Int>>
lateinit var visit : Array<Boolean>
var result = -1

fun main() {
    val n = br.readLine().toInt()
    val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

    arr = Array(n + 1){ ArrayList() }
    visit = Array(n + 1){ false}

    repeat(br.readLine().toInt()){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        arr[a].add(b)
        arr[b].add(a)
    }

    search(v1, v2, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(start : Int, end : Int, count : Int){
    if(start == end){
        result = count
        return
    }

    visit[start] = true
    for(i in 0 until arr[start].size){
        val next = arr[start][i]

        if(!visit[next])
            search(next, end, count + 1)
    }
}