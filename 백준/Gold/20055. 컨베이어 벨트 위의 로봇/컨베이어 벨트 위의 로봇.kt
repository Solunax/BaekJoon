import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val belt = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val robot = MutableList(n){ false }
    var result = 0

    while(belt.count {it == 0 } < k){
        belt.add(0, belt.last())
        belt.removeLast()

        robot.add(0, false)
        robot.removeLast()

        robot[n - 1] = false

        for(i in n - 1 downTo 1){
            if(robot[i - 1] && !robot[i] && belt[i] >= 1){
                robot[i] = true
                robot[i - 1] = false
                belt[i]--
            }
        }

        if(belt[0] > 0){
            robot[0] = true
            belt[0]--
        }

        belt[0]

        result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}