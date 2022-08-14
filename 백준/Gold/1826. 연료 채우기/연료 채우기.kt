import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val fuelQueue = PriorityQueue<Int>(reverseOrder())
    val station = PriorityQueue<Array<Int>> { o1, o2 ->
        o1[0] - o2[0]
    }

    repeat(n){
        station.add(br.readLine().split(" ").map{ it.toInt() }.toTypedArray())
    }

    var (goal, fuel) = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    while (fuel < goal){
        while(station.isNotEmpty() && fuel >= station.peek()[0]){
            fuelQueue.add(station.poll()[1])
        }

        if(fuelQueue.isEmpty()){
            result = -1
            break
        }
        
        fuel += fuelQueue.poll()
        result++
    }

    bw.write("$result")
    bw.close()
    br.close()
}