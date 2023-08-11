import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val arr = Array(100001){0}

fun main() {
   val (n, k) = br.readLine().split(" ").map{ it.toInt() }

    bw.write("${getResult(n, k)}")

    bw.close()
    br.close()
}

fun getResult(start : Int, endPoint : Int) : Int{
    val queue = LinkedList<Int>()

    queue.add(start)
    var now : Int
    arr[start] = 1

    while (queue.isNotEmpty()){
        now = queue.poll()

        if(now == endPoint)
            return arr[now] - 1

        if(now - 1 >= 0 && arr[now - 1] == 0){
            arr[now - 1] = arr[now] + 1
            queue.add(now - 1)
        }

        if(now + 1 <= 100000 && arr[now + 1] == 0){
            arr[now + 1] = arr[now] + 1
            queue.add(now + 1)
        }

        if(now * 2 <= 100000 && arr[now * 2] == 0){
            arr[now * 2] = arr[now] + 1
            queue.add(now * 2)
        }
    }

    return -1
}