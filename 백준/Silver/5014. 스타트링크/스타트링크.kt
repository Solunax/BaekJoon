import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val floor = input[0]
    val start = input[1]
    val goal = input[2]
    val up = input[3]
    val down = input[4]
    val arr = Array(floor + 1){0}
    val queue = LinkedList<Int>()
    var check = false

    queue.add(start)
    arr[start] = 1

    while (queue.isNotEmpty()){
        val now = queue.poll()

        if(now == goal){
            bw.write("${arr[now] - 1}")
            check = true
            break
        }

        if(now + up <= floor){
            if(arr[now + up] == 0){
                arr[now + up] = arr[now] + 1
                queue.add(now + up)
            }
        }

        if(now + up <= floor){
            if(arr[now + up] == 0){
                arr[now + up] = arr[now] + 1
                queue.add(now + up)
            }
        }

        if(now - down > 0){
            if(arr[now - down] == 0){
                arr[now - down] = arr[now] + 1
                queue.add(now - down)
            }
        }
    }

    if(!check)
        bw.write("use the stairs")

    bw.close()
    br.close()
}