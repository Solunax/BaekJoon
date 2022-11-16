import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (h, w) = br.readLine().split(" ").map { it.toInt() }

    val cloud = Array(h){ MutableList(w){""} }
    val map = Array(h){Array(w){-1}}

    repeat(h){
        cloud[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toMutableList()
    }

    for(i in 0 until h){
        var time = 0

        while(true){
            var cloudCheck = false

            for(j in 0 until w){
                if(cloud[i][j] == "c"){
                    cloudCheck = true

                    if(map[i][j] == -1)
                        map[i][j] = time
                }
            }

            time++
            if(!cloudCheck)
                break

            cloud[i].removeLast()
            cloud[i].add(0, ".")
        }
    }

    map.forEach {
        it.forEach {v ->
            bw.write("$v ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}