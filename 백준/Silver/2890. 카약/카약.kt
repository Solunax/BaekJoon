import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map{ it.toInt() }
    val locationData = ArrayList<Pair<Int, Int>>()
    val rank = ArrayList<Int>()

    repeat(r){
        val location = br.readLine().split("").filter { it.isNotEmpty() }.reversed()

        for(i in 1 until c){
            if(location[i] != "." && location[i] != "S"){
                if(!rank.contains(i - 1))
                    rank.add(i - 1)

                locationData.add(Pair(location[i].toInt(), i - 1))
                break
            }
        }
    }

    rank.sort()
    locationData.sortWith{ o1, o2 ->
        o1.first - o2.first
    }

    locationData.forEach {
        bw.write("${rank.indexOf(it.second) + 1}\n")
    }

    bw.close()
    br.close()
}