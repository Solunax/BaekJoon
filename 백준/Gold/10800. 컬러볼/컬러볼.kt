import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val balls = ArrayList<Ball>()

    repeat(n){
        val input = br.readLine().split(" ").map { v -> v.toInt() }
        balls.add(Ball(it, input[0], input[1]))
    }

    balls.sortBy {
        it.size
    }

    val result = Array(n){0}
    val color = Array(n+1){0}
    var sum = 0
    var index = 0
    for(i in 0 until n){
        val current = balls[i]

        while(balls[index].size < current.size){
            sum += balls[index].size
            color[balls[index].color] += balls[index].size
            index++
        }

        result[current.index] = sum - color[current.color]
    }

    result.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}

class Ball(val index : Int, val color : Int, val size : Int)

